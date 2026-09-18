package modelo;

public class Funcionario {
    private String idFuncionario;
    private String nomeFuncionario;
    private String endereco;
    private String email;
    private String login;
    private String senha;
    private boolean admin;

    //construtor inicial
    public Funcionario(String idColaborador, String nome, String endereco, String email, String login, String senha, boolean admin) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.endereco = endereco;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
    }

    //métodos getters e setters
    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void getSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = false;
    }

}