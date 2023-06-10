import json
import psycopg2

# Função para obter o nome do produto com base no ID
def get_nome_produto(id_produto):
    # Estabelecer conexão com o banco de dados
    conn = psycopg2.connect(
        host="localhost",
        port=5432,
        database="AutoDanfe2",
        user="postgres",
        password="admin"
    )
    # Criar cursor
    cur = conn.cursor()
    # Executar a consulta
    cur.execute(f"SELECT nome_produto FROM produtos WHERE id_produto = {id_produto}")
    # Obter o resultado
    result = cur.fetchone()
    # Fechar cursor e conexão
    cur.close()
    conn.close()
    # Retornar o nome do produto (ou None se não encontrado)
    return result[0] if result else None

# Função para obter o nome da transportadora com base no ID
def get_nome_transportadora(id_transportadora):
    # Estabelecer conexão com o banco de dados
    conn = psycopg2.connect(
        host="localhost",
        port=5432,
        database="AutoDanfe2",
        user="postgres",
        password="admin"
    )
    # Criar cursor
    cur = conn.cursor()
    # Executar a consulta
    cur.execute(f"SELECT razao_social_transp FROM transportadoras WHERE id_transportadora = {id_transportadora}")
    # Obter o resultado
    result = cur.fetchone()
    # Fechar cursor e conexão
    cur.close()
    conn.close()
    # Retornar o nome da transportadora (ou None se não encontrada)
    return result[0] if result else None

# Função para obter o nome do cliente com base no CNPJ
def get_nome_cliente(cnpj_cliente):
    # Estabelecer conexão com o banco de dados
    conn = psycopg2.connect(
        host="localhost",
        port=5432,
        database="AutoDanfe2",
        user="postgres",
        password="admin"
    )
    # Criar cursor
    cur = conn.cursor()
    # Executar a consulta
    cur.execute(f"SELECT razao_social_cliente FROM clientes WHERE CNPJ_cliente = '{cnpj_cliente}'")
    # Obter o resultado
    result = cur.fetchone()
    # Fechar cursor e conexão
    cur.close()
    conn.close()
    # Retornar o nome do cliente (ou None se não encontrado)
    return result[0] if result else None

# Lendo o arquivo JSON
with open('json.txt', 'r') as file:
    data = json.load(file)

# Obtendo o nome do cliente com base no CNPJ
nome_cliente = get_nome_cliente(data["id_destinatario"])

# Criando a string de especificações da nota
especificacoes_nota = f"""
Destinatário: {nome_cliente}

Itens:
{"-" * 100}
{"Nome Prod": <15}{"Quantidade": <15}{"Valor Unidade": <15}
{"-" * 100}
"""

for item in data["itens"]:
    nome_produto = get_nome_produto(item['id_prod'])
    especificacoes_nota += f"{nome_produto: <15}{item['quantidade']: <15}{item['valor_unidade']: <15}\n"

especificacoes_nota += f"""
Definições:
Parcelas: {data["definicoes"]["parcelas"]}
Tipo de operação: {data["definicoes"]["tipo_op"]}
Ordem Compra: {data["definicoes"]["tbOrdemCompra"]}

Transportadora:
Meio de Transporte: {data["transportadora"]["meio_transporte"]}
Transportadora: {data["transportadora"]["id_transp"]}
Razão Social: {get_nome_transportadora(data["transportadora"]["id_transp"])}
Espécie: {data["transportadora"]["especie"]}
Quantidade Volume: {data["transportadora"]["quantidadeVol"]}
Peso Líquido: {data["transportadora"]["peso_liquido"]}
Peso Bruto: {data["transportadora"]["peso_bruto"]}
"""

# Apagando o conteúdo do arquivo string.txt
with open('string.txt', 'w') as file:
    file.write('')

# Escrevendo a string no arquivo string.txt
with open('string.txt', 'w') as file:
    file.write(especificacoes_nota)

print("Arquivo string.txt atualizado com sucesso!")
