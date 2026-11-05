import modelo.Produto;
import repositorio.ProdutoRepositorio;

public class Programa {
    public static void main(String[] args){
        Produto boloDeChocolate = new Produto("0001","chocolate", "com chocolate", 200F, "1kg","1 hora", true);
        ProdutoRepositorio repositoriodeProdutos = new ProdutoRepositorio();
        repositoriodeProdutos.adicionarProduto(boloDeChocolate);
//        System.out.println(repositoriodeProdutos.getProdutos()[0].getNomeProduto());
        Produto[] produtosarray = repositoriodeProdutos.listarProdutos();
         for (int i = 0; i < produtosarray.length ; i++){
             if (produtosarray[i] != null ){
                 System.out.println(produtosarray[i].getNomeProduto());
             }
         }

    }
    //Criar um objeto de cada classe e utilizar cada um dos seus métodos//
}
