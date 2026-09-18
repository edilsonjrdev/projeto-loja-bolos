package modelo;

import java.time.LocalDateTime;

public class Pagamento {
    private String idPagamento;
    private LocalDateTime horarioPagamento;
    private double valorPagamento;
    private boolean parcelado;

    //construtor inicial
    public Pagamento(String idPagamento, LocalDateTime horarioPagamento, double valorPagamento, boolean parcelado) {
        this.idPagamento = idPagamento;
        this.horarioPagamento = horarioPagamento;
        this.valorPagamento = valorPagamento;
        this.parcelado = false;
    }

    //métodos getters e setters
    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

    public LocalDateTime getHorarioPagamento() {
        return horarioPagamento;
    }

    public void setHorarioPagamento(LocalDateTime horarioPagamento) {
        this.horarioPagamento = horarioPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public boolean isParcelado() {
        return parcelado;
    }

    public void setParcelado(boolean parcelado) {
        this.parcelado = parcelado;
    }
}
