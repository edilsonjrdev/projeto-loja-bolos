package repositorio;
import modelo.Acessorio;
import modelo.Produto;


public class AcessorioRepositorio {
    private Acessorio[] acessorios;

    //Construtor inicial
    public AcessorioRepositorio() {
        this.acessorios = new Acessorio[1000];
    }

    //metodos getters e setters
    public Acessorio[] getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(Acessorio[] acessorios) {
        this.acessorios = acessorios;
    }

    //Adicionar acessório
    public void adicionarAcessorio(Acessorio acessorio){
        for (int i = 0; i < acessorios.length; i++){
            if (acessorios[i] == null){
                acessorios[i] = acessorio;
                return;
            }
        }
    }

    //Buscando acessório
    public Acessorio buscarAcessoriososPorId(String idAcessorio) {
        for (int i = 0; i < acessorios.length; i++) {
            if (acessorios[i] != null && acessorios[i].getIdAcessorio().equals(idAcessorio)) {
                return acessorios[i];
            }
        }
        return null;
    }

    //Removendo acessório
    public void removerAcessoriosporId(String idAcessorio) {
        for (int i = 0; i < acessorios.length; i++) {
            if (acessorios[i] != null && acessorios[i].getIdAcessorio().equals(idAcessorio)) {
                acessorios[i] = null;
            }
            return;
        }
    }






}