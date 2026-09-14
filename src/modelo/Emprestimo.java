package modelo;

public class Emprestimo {
    private String idEmprestimo;
    private Item item;

    public Emprestimo(String idEmprestimo, Item item) {
        this.idEmprestimo = idEmprestimo;
        this.item = item;
    }

    public String getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(String idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
