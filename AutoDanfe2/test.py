import json

# Lê o arquivo JSON
with open('json.txt') as file:
    data = json.load(file)

# Imprime os valores
print("ID do Destinatário:", data["id_destinatario"])

print("Itens:")
for item in data["itens"]:
    print("ID do Produto:", item["id_prod"])
    print("Quantidade:", item["quantidade"])
    print("Valor por Unidade:", item["valor_unidade"])
    print()

print("Definições:")
print("Parcelas:", data["definicoes"]["parcelas"])
print("Tipo de Operação:", data["definicoes"]["tipo_op"])
print("Tabela Ordem de Compra:", data["definicoes"]["tbOrdemCompra"])

print("Transportadora:")
print("Meio de Transporte:", data["transportadora"]["meio_transporte"])
print("ID da Transportadora:", data["transportadora"]["id_transp"])
print("Razão Social:", data["transportadora"]["razao_social"])
print("Espécie:", data["transportadora"]["especie"])
print("Quantidade de Volumes:", data["transportadora"]["quantidadeVol"])
print("Peso Líquido:", data["transportadora"]["peso_liquido"])
print("Peso Bruto:", data["transportadora"]["peso_bruto"])
