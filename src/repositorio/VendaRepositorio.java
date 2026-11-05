package repositorio;
import modelo.Venda;

public class VendaRepositorio {
    private Venda[] vendas;

    //construtor inicial
    public VendaRepositorio() {
        this.vendas = new Venda[1000];
    }

    //métodos getters e setters

    public Venda[] getVendas() {
        return vendas;
    }

    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }

    //adicionar vendas
    public void adicionarVenda(Venda venda) {
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] == null) {
                vendas[i] = venda;
                return;
            }
        }
    }

    //listar vendas

    public Venda[] listarVendas() {
        return vendas;
    }

    //buscar vendas
    public Venda buscarVendasPorId(String idVendas) {
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] != null && vendas[i].getId().equals(idVendas)) {
                return vendas[i];
            }
        }
        return null;
    }

    //remover vendas
    public void removerVendasId (String idVenda) {
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] != null && vendas[i].getId().equals(idVenda)) {
                vendas[i] = null;
            }
            return;
        }
    }
}
