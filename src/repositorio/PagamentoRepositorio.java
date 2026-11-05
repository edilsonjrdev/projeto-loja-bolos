package repositorio;
import modelo.Pagamento;

public class PagamentoRepositorio {
    private Pagamento[] pagamentos;

    //construtor inicial
    public PagamentoRepositorio() {
        this.pagamentos = new Pagamento[100];
    }

    //métodos getters e setters

    public Pagamento[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamento[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    //adicionar pagamento
    public void adicionarPagamento(Pagamento pagamento) {
        for (int i = 0; i < pagamentos.length; i++) {
            if (pagamentos[i] == null) {
                pagamentos[i] = pagamento;
                return;
            }
        }
    }

    //listar pagamentos

    public Pagamento[] listarPagamentos() {
        return pagamentos;
    }

    //buscar pagamentos
    public Pagamento buscarPagamentosPorId(String idPagamento) {
        for (int i = 0; i < pagamentos.length; i++) {
            if (pagamentos[i] != null && pagamentos[i].getIdPagamento().equals(idPagamento)) {
                return pagamentos[i];
            }
        }
        return null;
    }

    //remover pagamentos
    public void removerPagamentosId(String idPagamento) {
        for (int i = 0; i < pagamentos.length; i++) {
            if (pagamentos[i] != null && pagamentos[i].getIdPagamento().equals(idPagamento)) {
                pagamentos[i] = null;
            }
            return;
        }
    }

}
