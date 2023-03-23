package Controller;

import AutoDanfeMenu.AutoDanfeMenu;
import AutoDanfeCadProd.CadastroProdutos;
import AutoDanfeCadTransp.CadastroTransportadoras;
import AutoDanfeCancelamentoNota.CancelamentoNota;
import AutoDanfeEmissaoBoleto.EmissaoBoleto;
import AutoDanfeCadCliente.CadastroClientes;
import AutoDanfeEmissaoNota.EmissaoDestinatario;
import AutoDanfeEmissaoNota.EmissaoProduto;
import AutoDanfeEmissaoNota.EmissaoDefinicoes;
import AutoDanfeEmissaoNota.EmissaoTransp;
import AutoDanfeEmissaoNota.EmissaoRevisao;
import AutoDanfeMenu.Menu;

public class Program {

    private static AutoDanfeMenu autoDanfeMenu;
    private static CadastroClientes cadastroClientes;
    private static CadastroProdutos cadastroProdutos;
    private static CadastroTransportadoras cadastroTransportadoras;
    private static CancelamentoNota cancelamentoNota;
    private static EmissaoBoleto emissaoBoleto;
    private static EmissaoDestinatario emissaoNota;
    private static Menu menu;
    private static EmissaoProduto emissaoProduto;
    private static EmissaoDefinicoes emissaoDefinicoes;
    private static EmissaoTransp emissaoTransp;
    private static EmissaoRevisao emissaoRevisao;
    
    
    private Program() {
    }
    
   public static Menu getMenu() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }


    public static AutoDanfeMenu getAutoDanfeMenu() {
        if (autoDanfeMenu == null) {
            autoDanfeMenu = new AutoDanfeMenu();
        }
        return autoDanfeMenu;
    }

    public static CadastroClientes getCadastroClientes() {
        if (cadastroClientes == null) {
            cadastroClientes = new CadastroClientes();
        }
        return cadastroClientes;
    }

    public static CadastroProdutos getCadastroProdutos() {
        if (cadastroProdutos == null) {
            cadastroProdutos = new CadastroProdutos();
        }
        return cadastroProdutos;
    }

    public static CadastroTransportadoras getCadastroTransportadoras() {
        if (cadastroTransportadoras == null) {
            cadastroTransportadoras = new CadastroTransportadoras();
        }
        return cadastroTransportadoras;
    }

    public static CancelamentoNota getCancelamentoNota() {
        if (cancelamentoNota == null) {
            cancelamentoNota = new CancelamentoNota();
        }
        return cancelamentoNota;
    }

    public static EmissaoBoleto getEmissaoBoleto() {
        if (emissaoBoleto == null) {
            emissaoBoleto = new EmissaoBoleto();
        }
        return emissaoBoleto;
    }

    public static EmissaoDestinatario getEmissaoNota() {
        if (emissaoNota == null) {
            emissaoNota = new EmissaoDestinatario();
        }
        return emissaoNota;
    }
    

    public static EmissaoProduto getEmissaoProduto() {
        if (emissaoProduto == null) {
            emissaoProduto = new EmissaoProduto();
        }
        return emissaoProduto;
    }

    public static EmissaoDefinicoes getEmissaoDefinicoes() {
        if (emissaoDefinicoes == null) {
            emissaoDefinicoes = new EmissaoDefinicoes();
        }
        return emissaoDefinicoes;
    }
   
    public static EmissaoTransp getEmissaoTransp() {
        if (emissaoTransp == null) {
            emissaoTransp = new EmissaoTransp();
        }
        return emissaoTransp;
    }
   
    public static EmissaoRevisao getEmissaoRevisao() {
        if (emissaoRevisao == null) {
            emissaoRevisao = new EmissaoRevisao();
        }
        return emissaoRevisao;
    }

} 
