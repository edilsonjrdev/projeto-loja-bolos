package repositorio;
import modelo.Agendamento;
import modelo.Produto;

import java.time.LocalDateTime;


public class AgendamentoRepositorio {
    private Agendamento[] agendamentos;

    //construtor inicial
    public AgendamentoRepositorio() {
        this.agendamentos = new Agendamento[1000];
    }

    //métodos getters e setters

    public Agendamento[] getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(Agendamento[] agendamentos) {
        this.agendamentos = agendamentos;
    }

    //adicionar agendamento
    public void adicionarAgendamento(Agendamento agendamento) {
        for (int i = 0; i < agendamentos.length; i++) {
            if (agendamentos[i] == null) {
                agendamentos[i] = agendamento;
                return;
            }
        }
    }

    //listar agendamento de vendas

    public Agendamento[] listarAgendamentos() {
        return agendamentos;
    }

    //buscar vendas agendadas
    public Agendamento buscarAgendamentosPorId(String venda) {
        for (int i = 0; i < agendamentos.length; i++) {
            if (agendamentos[i] != null && agendamentos[i].getVenda().equals(venda)) {
                return agendamentos[i];
            }
        }
        return null;
    }

    //remover agendamentos
    public void removerProdutosporId(String venda) {
        for (int i = 0; i < agendamentos.length; i++) {
            if (agendamentos[i] != null && agendamentos[i].getVenda().equals(venda)) {
                agendamentos[i] = null;
            }
            return;
        }
    }

}
