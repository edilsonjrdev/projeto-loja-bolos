package Interface;
import modelo.Produto;

public interface ProdutoInterface {
    public void adicionarProduto(Produto produto);
    public Produto[] listarProdutos();
    public Produto buscarProdutosPorId(String idProduto);
    public void removerProdutosporId(String idProduto);



}
