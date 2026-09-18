package modelo;

import java.time.LocalDateTime;

public class Agendamento {
    private Venda venda;
    private LocalDateTime retirada;
    private boolean disponivel;

    //construtor inicial
    public Agendamento(Venda venda, LocalDateTime retirada, boolean disponivel) {
        this.venda = venda;
        this.retirada = retirada;
        this.disponivel = true;
    }

    //métodos getters e setters
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public LocalDateTime getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDateTime retirada) {
        this.retirada = retirada;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
