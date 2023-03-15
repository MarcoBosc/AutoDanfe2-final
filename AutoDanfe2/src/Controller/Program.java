package Controller;

import AutoDanfeMenu.AutoDanfeMenu;
import AutoDanfeCadProd.CadastroProdutos;
import AutoDanfeCadTransp.CadastroTransportadoras;
import AutoDanfeCancelamentoNota.CancelamentoNota;
import AutoDanfeEmissaoBoleto.EmissaoBoleto;
import AutoDanfeCadCliente.CadastroClientes;
import AutoDanfeEmissaoNota.EmissaoNota;
import AutoDanfeMenu.Menu;

public class Program {

    private static AutoDanfeMenu autoDanfeMenu;
    private static CadastroClientes cadastroClientes;
    private static CadastroProdutos cadastroProdutos;
    private static CadastroTransportadoras cadastroTransportadoras;
    private static CancelamentoNota cancelamentoNota;
    private static EmissaoBoleto emissaoBoleto;
    private static EmissaoNota emissaoNota;
    private static Menu menu;

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

    public static EmissaoNota getEmissaoNota() {
        if (emissaoNota == null) {
            emissaoNota = new EmissaoNota();
        }
        return emissaoNota;
    }

} 
