package Interface;
import modelo.Acessorio;

public interface AcessorioInterface {
    public void adicionarAcessorio(Acessorio acessorio);
    public Acessorio buscarAcessoriososPorId(String idAcessorio);
    public void removerAcessoriosporId(String idAcessorio);
}
