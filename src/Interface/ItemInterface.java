package Interface;
import modelo.Item;

public interface ItemInterface {
    public void adicionarItem(Item item);
    public Item[] listarItens();
    public Item buscarItensPorId(String IdItem );
    public void removerItensporId(String idItem);
}
