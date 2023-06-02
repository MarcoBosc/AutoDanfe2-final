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

vencimentos = len(data["definicoes"]["parcelas"])
operacao = data["definicoes"]["tipo_op"]
Modalidade_frete = data["transportadora"]["meio_transporte"]
ordem_de_compra = data["definicoes"]["tbOrdemCompra"]
#pegar dados de transporte
CNPJ_trans = tbCNPJTrans.get()
qtd_vol = data["transportadora"]["quantidadeVol"]
especie = data["transportadora"]["especie"]
p_liq = data["transportadora"]["peso_liquido"]
p_brut = data["transportadora"]["peso_bruto"]
operation = data["definicoes"]["tipo_op"]
estado = 'RS' if operation == 'estadual' else cnpj_cliente
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
if operation == 'Interna':
    navegador.find_element(By.NAME, 'f_idDest').send_keys('Interna') 
elif operation == 'Interestadual':
    navegador.find_element(By.NAME, 'f_idDest').send_keys('Interestadual')
    navegador.find_element(By.NAME, 'f_dest_enderDest_UF').send_keys(estado)
time.sleep(1)
navegador.find_element(By.NAME, 'f_cNatureza').send_keys('v')
navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[3]/a/span').click()
#preencher CNPJ do destinatário
navegador.find_element(By.NAME, 'f_dest_CNPJCPF').send_keys(CNPJ)
navegador.find_element(By.NAME, 'btPreencherDest').click()
time.sleep(2)
navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[4]/a/span').click()
#adicionar itens
dados_conexao = ("Driver={SQLite3 ODBC Driver} ; Server=localhost; Database=produtos.db")

conexao = pyodbc.connect(dados_conexao)

cursor = conexao.cursor()

cursor.execute("SELECT * FROM Produtos")

produtos = cursor.fetchall()

descricao = cursor.description

cursor.close()
conexao.close()

colunas = [tupla[0] for tupla in descricao]
tabela_produtos = pd.DataFrame.from_records(produtos, columns = colunas)

produtos = tabela_produtos
produto = ''
lista_de_codigos = produtos['Produto'].to_list()

for linha in produtos.index:
    item = produtos.loc[linha, 'Produto']
    if item in lista_de_itens:
        code = produtos.loc[linha,'Codigo']
        produto = produtos.loc[linha, 'Produto']
        valor = how_much[str(item)]
        #valor = float(valor) / 10
        valor = str(valor)
        valor = valor.replace('.',',')
        qtde = how_many[str(item)]
        NCM = produtos.loc[linha,'NCM']
        navegador.find_element(By.NAME, 'btIncDet').click()
        time.sleep(2)
        navegador.find_element(By.NAME, 'f_det_prod_cProd').send_keys(str(code))
        navegador.find_element(By.NAME, 'f_det_prod_xProd').send_keys(str(produto))
        navegador.find_element(By.NAME, 'f_det_prod_CFOP').send_keys('5')
        navegador.find_element(By.NAME, 'f_det_prod_NCM').send_keys(str(NCM))
        navegador.find_element(By.NAME, 'f_det_prod_uCom_combo').send_keys('pc')
        navegador.find_element(By.NAME, 'f_det_prod_vUnCom').send_keys(str(valor))
        navegador.find_element(By.NAME, 'f_det_prod_qCom').send_keys(str(qtde))
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
valor_parcelas = novo_total / float(len(Parcelas))

navegador.find_element(By.XPATH, '//*[@id="acoesAbaNivel1"]/ol/li[6]/a').click()
if transporte == 'Não':
    navegador.find_element(By.NAME, 'f_transp_modFrete').send_keys(Modalidade_frete)
elif transporte == 'Sim':
    navegador.find_element(By.NAME, 'f_transp_modFrete').send_keys(Modalidade_frete)
    navegador.find_element(By.ID, 'f_transp_transporta_CNPJCPF').send_keys(CNPJ_trans)
    dados_conexao = ("Driver={SQLite3 ODBC Driver} ; Server=localhost; Database=produtos.db")

    conexao = pyodbc.connect(dados_conexao)

    cursor = conexao.cursor()

    cursor.execute("SELECT * FROM Transportadoras")

    produtos = cursor.fetchall()

    descricao = cursor.description

    cursor.close()
    conexao.close()

    for transp in produtos:
        if transp[1] == CNPJ_trans:
            razao_social = transp[2]
            IE = transp[3]
            logradouro = transp[4]
            UF_trans = transp[5]
            cidade_trans = transp[6]
            navegador.find_element(By.ID, 'f_transp_transporta_xNome').send_keys(razao_social)
            navegador.find_element(By.ID, 'f_transp_transporta_IE').send_keys(IE)
            navegador.find_element(By.ID, 'f_transp_transporta_xEnder').send_keys(logradouro)
            navegador.find_element(By.ID, 'f_transp_transporta_UF').click()

            for estados in range(2,30):
                local = navegador.find_element(By.XPATH, f'//*[@id="f_transp_transporta_UF"]/option[{estados}]').get_attribute('value')
                if local == UF_trans:
                    navegador.find_element(By.XPATH, f'//*[@id="f_transp_transporta_UF"]/option[{estados}]').click()
                    time.sleep(2)
                    navegador.find_element(By.ID, 'f_transp_transporta_xMun').send_keys(cidade_trans)
                    time.sleep(1)
            navegador.find_element(By.ID, 'aba_vol').click()
            time.sleep(0.5)
            navegador.find_element(By.ID, 'btInc').click()
            time.sleep(1.5)
            navegador.find_element(By.ID, 'f_VOL_qVol').send_keys(qtd_vol)
            navegador.find_element(By.ID, 'f_VOL_esp').send_keys(especie)
            navegador.find_element(By.ID, 'f_VOL_pesoL').send_keys(p_liq)
            navegador.find_element(By.ID, 'f_VOL_pesoB').send_keys(p_brut)
            navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div[3]/input[1]').click()
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
for date in Parcelas:
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