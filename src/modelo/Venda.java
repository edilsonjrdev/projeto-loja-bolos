package modelo;

import java.time.LocalDateTime;

public class Venda {
    private String id;
    private Pagamento pagamento;
    private Funcionario funcionario;
    private LocalDateTime horario;

    //construtor inicial
    public Venda(String id, Pagamento pagamento, Funcionario funcionario, LocalDateTime horario) {
        this.id = id;
        this.pagamento = pagamento;
        this.funcionario = funcionario;
        this.horario = horario;
    }

    //métodos getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Funcionario getColaborador() {
        return funcionario;
    }

    public void setColaborador(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
}
