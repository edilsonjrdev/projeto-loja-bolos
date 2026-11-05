package servicos;

import Interface.ProdutoInterface;
import modelo.Produto;
import repositorio.ProdutoRepositorio;
import Excecoes.PagamentoNuloException;
import Excecoes.ProdutoDuplicadoException;
import Excecoes.ProdutoIndisponivelException;
import Excecoes.ProdutoNaoEncontradoException;


public class ProdutoServicos {
    private ProdutoInterface produtoInterface;

    //construtor
    public ProdutoServicos(ProdutoInterface produtoInterface) {
        this.produtoInterface = produtoInterface;
    }

    public ProdutoInterface getProdutoInterface() {
        return produtoInterface;
    }

    public void setProdutoInterface(ProdutoInterface produtoInterface) {
        this.produtoInterface = produtoInterface;
    }

    public void adicionarProduto(Produto produto) throws ProdutoDuplicadoException {
        Produto produtoExistente = produtoInterface.buscarProdutosPorId(produto.getIdProduto());
        if (produtoExistente != null) {
            throw new ProdutoDuplicadoException("O produto: " + produto.getIdProduto() + " já está cadastrado.");
        }
        produtoInterface.adicionarProduto(produto);
    }
}




