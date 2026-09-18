package repositorio;

import modelo.Produto;

public class ProdutoRepositorio {
    private int proximaPosicaoLivre;
    private Produto[] produtos = new Produto[100];

    //construtor inicial
    public ProdutoRepositorio() {
        this.proximaPosicaoLivre = 0;
        this.produtos = new Produto[100];
    }

    //métodos getters e setters
    public int getProximaPosicaoLivre() {
        return proximaPosicaoLivre;
    }

    public void setProximaPosicaoLivre(int proximaPosicaoLivre) {
        this.proximaPosicaoLivre = proximaPosicaoLivre;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    //adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos[proximaPosicaoLivre] = produto;
        proximaPosicaoLivre++;
    }

    //listar produtos
    public Produto[] listarProdutos() {
        return produtos;
    }

    //buscar produto por id
    public Produto buscarProdutoPorId(String idProduto) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (produtos[i] != null && produtos[i].getIdProduto().equals(idProduto)) {
                return produtos[i];
            }
        }
        return null;
    }

    //buscar produto por nome
    public Produto buscarProdutoPorNome(String nomeProduto) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (produtos[i] != null && produtos[i].getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                return produtos[i];
            }
        }
        return null;
    }

    //remover produto
    public boolean removerProduto(String idProduto) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (produtos[i] != null && produtos[i].getIdProduto().equals(idProduto)) {
                for (int j = i; j < proximaPosicaoLivre - 1; j++) {
                    produtos[j] = produtos[j + 1];
                    produtos[proximaPosicaoLivre - 1] = null;
                    proximaPosicaoLivre--;
                    return true;
                }
            }
        }
        return false;
    }
}