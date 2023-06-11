
import psycopg2
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
import time

def pegar_id_nota():
    with open('notaCancelar.txt', 'r') as file:
        id_nota = file.read().strip()
    return id_nota

def pegar_num_nota(id_nota):
    try:
        conn = psycopg2.connect(
            host="localhost",
            port=5432,
            database="AutoDanfe2",
            user="postgres",
            password="admin"
        )
        cur = conn.cursor()
        cur.execute("SELECT num_nota FROM danfe WHERE id_danfe = %s", (id_nota,))
        num_nota = cur.fetchone()[0]
        return num_nota

    except Exception as e:
        print(f"Ocorreu um erro: {e}")

    finally:
        if cur is not None:
            cur.close()
        if conn is not None:
            conn.close()

def realizar_cancelamento(numNota):
    numNota = ""
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
    navegador.find_element(By.ID, 'btSel').click()
    time.sleep(1)
    for item in range(1,11):
        nfeLink = navegador.find_element(By.XPATH, f'/html/body/form/div[2]/div/div[3]/table/tbody/tr[{item}]/td[2]/a').get_attribute('href')
        if nfeLink == f'https://nfe-extranet.sefazrs.rs.gov.br/apl/nfa/nfe_avulsaNfe/avulsaNfe_edicao.aspx?CodIntAvulsaNfe={numNota}':
            navegador.find_element(By.XPATH, f'/html/body/form/div[2]/div/div[3]/table/tbody/tr[{item}]/td[1]/input').click()
            navegador.find_element(By.ID, 'btSel').click()
            navegador.find_element(By.XPATH, '/html/body/form/div[1]/div[2]/div[4]/input[4]').click()
            time.sleep(3)
            navegador.find_element(By.ID, 'f_Cancel_xJust').send_keys('Erros encontrados.')
            navegador.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/div/input[1]').click()
            time.sleep(3)
            navegador.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/input[1]').click()
            time.sleep(3)
            navegador.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/div/input').click()
id_nota = pegar_id_nota()
num_nota = pegar_num_nota(id_nota)
realizar_cancelamento(num_nota)


