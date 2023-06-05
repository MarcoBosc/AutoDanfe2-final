import json
from selenium.webdriver.common.by import By
import time
from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.alert import Alert
import psycopg2
import adicionar_nota_db

# Lê o arquivo JSON
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

# Função para obter o nome da transportadora com base no ID
def get_transportadora(id_transportadora):
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
    cur.execute(f"SELECT * FROM transportadoras WHERE id_transportadora = {id_transportadora}")
    # Obter o resultado
    result = cur.fetchone()
    # Fechar cursor e conexão
    cur.close()
    conn.close()
    # Retornar o nome da transportadora (ou None se não encontrada)
    return result if result else None

# Função para obter o nome do cliente com base no CNPJ
def get_cliente(cnpj_cliente):
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
    cur.execute(f"SELECT * FROM clientes WHERE CNPJ_cliente = '{cnpj_cliente}'")
    # Obter o resultado
    result = cur.fetchone()
    # Fechar cursor e conexão
    cur.close()
    conn.close()
    # Retornar o nome do cliente (ou None se não encontrado)
    return result if result else None



vencimentos = len(data["definicoes"]["parcelas"])
operacao = data["definicoes"]["tipo_op"]
Modalidade_frete = data["transportadora"]["meio_transporte"]
ordem_de_compra = data["definicoes"]["tbOrdemCompra"]
#pegar dados de transporte
TR = get_transportadora(data["transportadora"]["id_transp"])
CNPJ_trans = TR[2]
qtd_vol = data["transportadora"]["quantidadeVol"]
especie = data["transportadora"]["especie"]
p_liq = data["transportadora"]["peso_liquido"]
p_brut = data["transportadora"]["peso_bruto"]
operation = data["definicoes"]["tipo_op"]
cl = get_cliente(data["id_destinatario"])
uf_cliente = cl[5]
estado = 'RS' if operation == 'estadual' else uf_cliente
#att o webdriveR
services = Service(ChromeDriverManager().install())
#abrir o navegador
options = webdriver.ChromeOptions()
options.add_argument(r'user-data-dir=C:\Users\Marco\AppData\Local\Google\Chrome\User Data\Profile Selenium')
navegador = webdriver.Chrome(service = services, options=options)
#entrar no site do sefaz https://www.sefaz.rs.gov.br/Receita/PortaleCAC.aspx
navegador.get('https://www.sefaz.rs.gov.br/Receita/PortaleCAC.aspx')
#fazer login com o certificado digital xpath://*[@id="principal"]/div[2]/div/div/div/div[1]/ul/li/a
navegador.find_element(By.CLASS_NAME, 'glyphicon').click()
#acessar certificado digital xpath: //*[@id="frmCert"]/table/tbody/tr/td/fieldset/div/table/tbody/tr/td/fieldset[1]/div/table/tbody/tr[2]/td[2]/label/a
navegador.find_element(By.XPATH, '//*[@id="frmCert"]/table/tbody/tr/td/fieldset/div/table/tbody/tr/td/fieldset[1]/div/table/tbody/tr[2]/td[2]/label/a').click()
#clicar em ok no pop up dando enter DEMONIO DESGRAÇA QUE N FUNCIONA POR NADA
#time.sleep(2)
#
#time.sleep(3)
#clicar no outro ok xpath [@id="painelConteudo"]/ta        ble/tbody/tr/td/input[5]
navegador.find_element(By.XPATH, '//*[@id="painelConteudo"]/table/tbody/tr/td/input[5]').click()
#clicar em clique aqui xpath //*[@id="textocentral"]/table/tbody/tr[2]/td/a
navegador.get('https://www.sefaz.rs.gov.br/NFE/NFE-NFA.aspx')

#alterar a janela
aba_de_notas = navegador.window_handles[1]
navegador.switch_to.window(aba_de_notas)
#selecionar a caixa //*[@id="chklstSelecaoEmit"]
time.sleep(3)
frame = navegador.find_element(By.ID, "frmDados")
navegador.switch_to.frame(frame)

navegador.find_element(By.XPATH, '//*[@id="chklstSelecaoEmit"]').click()
#clicar em selecionar //*[@id="btSel"]


navegador.find_element(By.ID, 'btSel').click()
#clicar em nova nfe
time.sleep(3)
navegador.find_element(By.ID, 'btInc').click()
alerta = Alert(navegador)
time.sleep(2)
alerta.dismiss()
#preencher nfe
navegador.find_element(By.NAME, 'f_tpNF').send_keys('s')
print(operation)
if operation.upper() == 'INTERNA':
    navegador.find_element(By.NAME, 'f_idDest').send_keys('Interna')
elif operation.upper() == 'INTERESTADUAL':
    navegador.find_element(By.NAME, 'f_idDest').send_keys('Interestadual')
    navegador.find_element(By.NAME, 'f_dest_enderDest_UF').send_keys(estado)
time.sleep(1)
navegador.find_element(By.NAME, 'f_cNatureza').send_keys('v')
navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[3]/a/span').click()
#preencher CNPJ do destinatário
navegador.find_element(By.NAME, 'f_dest_CNPJCPF').send_keys(cl[2])
navegador.find_element(By.ID, 'f_dest_xNome').send_keys(cl[1])
if cl[3].upper() != "ISENTO" and cl[3].upper() != "NÃO CONTRIBUINTE":
    navegador.find_element(By.ID, 'f_dest_IE').send_keys(cl[3])
else:
    navegador.find_element(By.ID, 'f_dest_isentoICMS').click()
    navegador.find_element(By.ID, 'f_dest_semIE').send_keys('ISENTO') if cl[3].upper() == "ISENTO" else navegador.find_element(By.ID, 'f_dest_semIE').send_keys('NÃO CONTRIBUINTE')
navegador.find_element(By.ID, 'f_dest_enderDest_xLgr').send_keys(cl[8])
navegador.find_element(By.ID, 'f_dest_enderDest_nro').send_keys(cl[9])
navegador.find_element(By.ID, 'f_dest_enderDest_xBairro').send_keys(cl[6])
navegador.find_element(By.ID, 'f_dest_enderDest_CEP').send_keys(cl[4])
navegador.find_element(By.ID, 'f_dest_enderDest_cMun').send_keys(cl[7])
navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[4]/a/span').click()
#adicionar itens
for item in data["itens"]:
    navegador.find_element(By.ID, 'btIncDet').click()
    prod = get_produto(item["id_prod"])
    time.sleep(2)
    navegador.find_element(By.NAME, 'f_det_prod_cProd').send_keys(prod[1])
    navegador.find_element(By.NAME, 'f_det_prod_xProd').send_keys(prod[2])
    navegador.find_element(By.NAME, 'f_det_prod_CFOP').send_keys('5')
    navegador.find_element(By.NAME, 'f_det_prod_NCM').send_keys(prod[3])
    navegador.find_element(By.NAME, 'f_det_prod_uCom_combo').send_keys('pc')
    navegador.find_element(By.NAME, 'f_det_prod_qCom').send_keys(item["quantidade"])
    try:
        valor_unidade = item["valor_unidade"].replace(',', '.')
    except:
        pass
    navegador.find_element(By.ID, 'f_det_prod_vUnCom').send_keys(valor_unidade)
    navegador.find_element(By.ID, 'aba_dettributos').click()
    time.sleep(1)
    navegador.find_element(By.NAME, 'f_det_ICMS_orig').send_keys('0')
    navegador.find_element(By.NAME, 'f_det_ICMS_situacaoTributaria').click() #bt 103 q da erro
    time.sleep(1)
    navegador.find_element(By.XPATH, '//*[@id="f_det_ICMS_situacaoTributaria"]/option[4]').click()
    navegador.find_element(By.ID, 'aba_detimpostosPIS').click()
    navegador.find_element(By.NAME, 'f_det_PIS_situacaoTributaria').click()
    time.sleep(1)
    navegador.find_element(By.XPATH, '//*[@id="f_det_PIS_situacaoTributaria"]/option[8]').click()
    navegador.find_element(By.ID, 'aba_detimpostosCOFINS').click()
    navegador.find_element(By.NAME, 'f_det_COFINS_situacaoTributaria').click()
    time.sleep(1)
    navegador.find_element(By.XPATH, '//*[@id="f_det_COFINS_situacaoTributaria"]/option[8]').click()
    try:
        navegador.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/div/input[1]').click()  # bt vali
    except:
        navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/input[1]').click()
    time.sleep(1)
    try:
        navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/input').click() #bt ok
    except:
        navegador.find_element(By.XPATH, '/html/body/div[4]/div/div[2]/div/input').click()
    time.sleep(1)
    try:
        navegador.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/div/input[2]').click() #bt salv
    except:
        navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/input[2]').click()
    time.sleep(1)
# pegar valor total
navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[5]/a').click()
total = navegador.find_element(By.ID, 'f_ICMSTot_vNF').get_attribute('value')

try:
    novo_total = total.replace('.', '')
except:
    pass
novo_total = novo_total.replace(',', '.')
novo_total = float(novo_total)
valor_parcelas = novo_total / float(len(data["definicoes"]["parcelas"]))

navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[6]/a').click()
navegador.find_element(By.NAME, 'f_transp_modFrete').send_keys(Modalidade_frete)
if Modalidade_frete[0] == "0" or Modalidade_frete[0] == "1" or Modalidade_frete[0] == "2":
    navegador.find_element(By.ID, 'f_transp_transporta_CNPJCPF').send_keys(CNPJ_trans)
    navegador.find_element(By.ID, 'f_transp_transporta_xNome').send_keys(TR[1])
    navegador.find_element(By.ID, 'f_transp_transporta_IE').send_keys(TR[3])
    navegador.find_element(By.ID, 'f_transp_transporta_xEnder').send_keys(TR[6])
    navegador.find_element(By.ID, 'f_transp_transporta_UF').send_keys(TR[4])
    navegador.find_element(By.ID, 'f_transp_transporta_xMun').send_keys(TR[5])
    navegador.find_element(By.ID, 'aba_vol').click()
    time.sleep(2)
    navegador.find_element(By.ID, 'btInc').click()
    time.sleep(2)
    navegador.find_element(By.ID, 'f_VOL_qVol').send_keys(qtd_vol)
    navegador.find_element(By.ID, 'f_VOL_esp').send_keys(especie)
    navegador.find_element(By.ID, 'f_VOL_pesoL').send_keys(p_liq)
    navegador.find_element(By.ID, 'f_VOL_pesoB').send_keys(p_brut)
    navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div[3]/input[1]').click()
    time.sleep(1)

#pagamento
navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[9]/a').click()
navegador.find_element(By.NAME, 'btIncPag').click()
time.sleep(1)
navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[2]/select').send_keys('15')
navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/table/tbody/tr[3]/td[2]/input').send_keys(total)
navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/table/tbody/tr[4]/td[2]/select').send_keys('0')
navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/input[1]').click()

#adicionar descrição
navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[10]/a').click()
description = f"""Microempresa optante pelo simples nacional, não gera direito ao crédito de ICMS e IPI. Ordem de compra número: {ordem_de_compra}
vencimento(s):
"""
navegador.find_element(By.NAME, 'f_infAdic_infCpl').send_keys(description)
for date in data["definicoes"]["parcelas"]:
    navegador.find_element(By.NAME, 'f_infAdic_infCpl').send_keys(date)
    navegador.find_element(By.NAME, 'f_infAdic_infCpl').send_keys(' ')
    navegador.find_element(By.NAME, 'f_infAdic_infCpl').send_keys(f'R${valor_parcelas:.2f}')
    navegador.find_element(By.NAME, 'f_infAdic_infCpl').send_keys(' ')
#clicar em emitir
navegador.find_element(By.NAME, 'btVali').click()
time.sleep(1)
navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/input').click()
time.sleep(1)
navegador.find_element(By.NAME, 'btTrans').click()                          ##########################################
time.sleep(1)
navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/input[1]').click()
time.sleep(1)
navegador.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/div/input').click()
# mandar por email por enquanto só o  da mãe
navegador.find_element(By.NAME, 'btExtra').click()
time.sleep(1)
navegador.find_element(By.NAME, 'f_extras_email').send_keys('marcob.brl@gmail.com')
navegador.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/table[2]/tbody/tr[3]/td[2]/span/input').click()
time.sleep(8)
navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/input').click()


# Chama a função que adiciona a nota no database
adicionar_nota_db()