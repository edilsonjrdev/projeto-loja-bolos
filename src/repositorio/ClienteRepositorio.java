package repositorio;

import modelo.Cliente;

public class ClienteRepositorio {
    private int proximaPosicaoLivre;
    private Cliente[] clientes = new Cliente[100];

    //construtor inicial
    public ClienteRepositorio() {
        this.proximaPosicaoLivre = 0;
        this.clientes = new Cliente[100];
    }

    //métodos getters e setters
    public int getProximaPosicaoLivre() {
        return proximaPosicaoLivre;
    }

    public void setProximaPosicaoLivre(int proximaPosicaoLivre) {
        this.proximaPosicaoLivre = proximaPosicaoLivre;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    //adicionar cliente
    public void adicionarCliente(Cliente cliente) {
        clientes[proximaPosicaoLivre] = cliente;
        proximaPosicaoLivre++;
    }

    //listar clientes
    public Cliente[] listarClientes() {
        return clientes;
    }

    //buscar cliente por id
    public Cliente buscarClientePorId(String idCliente) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (clientes[i] != null && clientes[i].getIdCliente().equals(idCliente)) {
                return clientes[i];
            }
        }
        return null;
    }

    //buscar cliente por nome
    public Cliente buscarClientePorNome(String nomeCliente) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (clientes[i] != null && clientes[i].getNomeCliente().equalsIgnoreCase(nomeCliente)) {
                return clientes[i];
            }
        }
        return null;
    }

    //remover cliente
    public boolean removerCliente(String idCliente) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (clientes[i] != null && clientes[i].getIdCliente().equals(idCliente)) {
                for (int j = i; j < proximaPosicaoLivre - 1; j++) {
                    clientes[j] = clientes[j + 1];
                    clientes[proximaPosicaoLivre - 1] = null;
                    proximaPosicaoLivre--;
                    return true;
                }
            }
        }
        return false;
    }
}