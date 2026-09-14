package modelo;

import java.time.LocalDateTime;

public class Venda {
    private String id;
    private Pagamento pagamento;
    private Colaborador colaborador;
    private LocalDateTime horario;

    public Venda(String id, Pagamento pagamento, Colaborador colaborador, LocalDateTime horario) {
        this.id = id;
        this.pagamento = pagamento;
        this.colaborador = colaborador;
        this.horario = horario;
    }

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

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
}
