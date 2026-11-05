package repositorio;
import modelo.Item;

public class ItemRepositorio {
    private Item[] itens;

    //construtor inicial
    public ItemRepositorio() {
        this.itens = new Item[100];
    }

    //métodos getters e setters

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    //adicionar item
    public void adicionarItem(Item item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                return;
            }
        }
    }

    //listar itens

    public Item[] listarItens() {
        return itens;
    }

    //buscar itens
    public Item buscarItensPorId(String IdItem ) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] != null && itens[i].getIdItem().equals( IdItem)) {
                return itens[i];
            }
        }
        return null;
    }

    //remover itens
    public void removerItensporId(String idItem) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] != null && itens[i].getIdItem().equals(idItem)) {
                itens[i] = null;
            }
            return;
        }
    }

}
