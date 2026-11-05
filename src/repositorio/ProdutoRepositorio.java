package repositorio;
import Interface.ProdutoInterface;
import modelo.Produto;
import Interface.ProdutoInterface;
import java.lang.reflect.Array;

public class ProdutoRepositorio implements ProdutoInterface {
    private Produto[] produtos;

    //construtor inicial
    public ProdutoRepositorio() {
        this.produtos = new Produto[100];
    }

    //métodos getters e setters

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    //adicionar produto
    public void adicionarProduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                return;
            }
        }
    }

    //listar produtos

    public Produto[] listarProdutos() {
        return produtos;
    }

    //buscar produtos
    public Produto buscarProdutosPorId(String idProduto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getIdProduto().equals(idProduto)) {
                return produtos[i];
            }
        }
        return null;
    }

    //remover produtos
    public void removerProdutosporId(String idProduto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getIdProduto().equals(idProduto)) {
                produtos[i] = null;
            }
            return;
        }
    }

}

