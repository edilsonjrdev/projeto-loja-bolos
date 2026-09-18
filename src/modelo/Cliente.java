package modelo;

public class Cliente {
    private String idCliente;
    private String nomeCliente;
    private String endereco;
    private String telefone;
    private String email;

    //construtor inicial
    public Cliente(String idCliente, String nomeCliente, String endereco, String telefone, String email) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    //métodos getters e setters
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
