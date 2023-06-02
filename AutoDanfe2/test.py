from selenium import webdriver
from selenium.webdriver.common.by import By

# Configuração do WebDriver
driver = webdriver.Chrome()  # Certifique-se de ter o ChromeDriver instalado e no PATH
driver.maximize_window()  # Maximiza a janela do navegador

# Navegar para o link
url = "https://www.sefaz.rs.gov.br/Receita/PortaleCAC.aspx"
driver.get(url)

# Aguardar alguns segundos para a página carregar completamente (opcional)
driver.find_element(By.CLASS_NAME, 'glyphicon').click()
driver.find_element(By.XPATH, '//*[@id="frmCert"]/table/tbody/tr/td/fieldset/div/table/tbody/tr/td/fieldset[1]/div/table/tbody/tr[2]/td[2]/label/a').click()

