package modelo;

public class Acessorio {
    private String idAcessorio;
    private String nomeAcessorio;
    private String descricaoAcessorio;
    private boolean disponivel;

    public Acessorio(String id, String nome, String descricao, String disponivel) {
        this.idAcessorio = idAcessorio;
        this.nomeAcessorio = nomeAcessorio;
        this.descricaoAcessorio = descricaoAcessorio;
        this.disponivel = true;
    }

    public String getIdAcessorio() {
        return idAcessorio;
    }

    public void setIdAcessorio(String idAcessorio) {
        this.idAcessorio = idAcessorio;
    }

    public String getNomeAcessorio() {
        return nomeAcessorio;
    }

    public void setNome(String nomeAcessorio) {
        this.nomeAcessorio = nomeAcessorio;
    }

    public String getDescricaoAcessorio() {
        return descricaoAcessorio;
    }

    public void setDescricaoAcessorio(String descricaoAcessorio) {
        this.descricaoAcessorio = descricaoAcessorio;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = true;
    }
}
