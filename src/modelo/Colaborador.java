package modelo;

public class Colaborador {
    private String idColaborador;
    private String nome;
    private String endereco;
    private String email;
    private String login;
    private String senha;
    private boolean admin;

    public Colaborador(String idColaborador, String nome, String endereco, String email, String login, String senha, boolean admin){
        this.idColaborador = idColaborador;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
    }

    public String getIdColaborador(){
        return idColaborador;
    }

    public void setIdColaborador(String idColaborador){
        this.idColaborador = idColaborador;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void getSenha(String senha){
        this.senha = senha;
    }

    public boolean getAdmin(){
        return admin;
    }

    public void setAdmin(boolean admin){
        this.admin = false;
    }

}
