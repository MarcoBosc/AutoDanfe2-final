import json
import psycopg2

with open('json.txt') as file:
    data = json.load(file)


def get_produto(id_produto):
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
    cur.execute(f"SELECT * FROM produtos WHERE id_produto = {id_produto}")
    # Obter o resultado
    result = cur.fetchone()
    # Fechar cursor e conexão
    cur.close()
    conn.close()
    # Retornar o nome do produto (ou None se não encontrado)
    return result if result else None

for item in data["itens"]:
    result = get_produto(item["id_prod"])
    print("Cod Prod:", result[1])
    print("Nome Prod:", result[2])
    print("NCM Prod:", result[3])
    print("Quantidade:", item["quantidade"])
    print("Valor por Unidade:", item["valor_unidade"])
    print(10 * '-')