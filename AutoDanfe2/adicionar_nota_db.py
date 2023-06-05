import json
import psycopg2

def adicionar_nota_db():
    try:
        # Conecta ao banco de dados
        conn = psycopg2.connect(
            host="localhost",
            port=5432,
            database="AutoDanfe2",
            user="postgres",
            password="admin"
        )

        # Cria um novo cursor
        cur = conn.cursor()

        # Ler o arquivo json
        with open('json.txt', 'r') as file:
            data = json.load(file)
            # Insere um novo pedido
            cur.execute(
                "INSERT INTO pedidos (num_pedido, total_pedido) VALUES (%s, %s) RETURNING id_pedido",
                (data['definicoes']['tbOrdemCompra'], sum(float(item['valor_unidade']) * int(item['quantidade']) for item in data['itens']))
            )
            id_pedido = cur.fetchone()[0]  # Recupera o id do pedido inserido
            # Insere itens do pedido
            for item in data['itens']:
                cur.execute(
                    "INSERT INTO itens_pedido (id_pedido, id_produto, qtd_produto, valor_produto, total_produto) VALUES (%s, %s, %s, %s, %s)",
                    (id_pedido, int(item['id_prod']), int(item['quantidade']), float(item['valor_unidade']), float(item['valor_unidade']) * int(item['quantidade']))
                )
        
            # Insere as parcelas
            for parcela in data['definicoes']['parcelas']:
                cur.execute(
                    "INSERT INTO parcelas (id_pedido, data_parcela) VALUES (%s, %s) RETURNING id_parcelas",
                    (id_pedido, parcela)
                )
            id_parcelas = cur.fetchone()[0]  # Recupera o id da última parcela inserida

            cur.execute(
                "SELECT id_cliente FROM clientes WHERE CNPJ_cliente = %s",
                (data['id_destinatario'],)
            )   
            id_cliente = cur.fetchone()[0]
            print(id_cliente)
            # Insere na tabela danfe
            cur.execute(
                "INSERT INTO danfe (id_cliente, id_pedido, id_transportadora, data_emissao, id_parcelas) VALUES (%s, %s, %s, CURRENT_DATE, %s)",
                (id_cliente, id_pedido, data['transportadora']['id_transp'] if 'transportadora' in data else None, id_parcelas)
            )

            # Efetua o commit das operações
            conn.commit()

            print("Nota adicionada com sucesso.")

    except Exception as e:
        print(f"Ocorreu um erro: {e}")

    finally:
        # Fecha o cursor e a conexão
        if cur is not None:
            cur.close()
        if conn is not None:
            conn.close()


