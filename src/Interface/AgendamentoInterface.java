package Interface;
import modelo.Agendamento;

public interface AgendamentoInterface {
    public void adicionarAgendamento(Agendamento agendamento);
    public Agendamento[] listarAgendamentos();
    public Agendamento buscarAgendamentosPorId(String venda);
    public void removerProdutosporId(String venda);

}
