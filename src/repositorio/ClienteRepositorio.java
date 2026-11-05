package repositorio;

import modelo.Cliente;
import modelo.Emprestimo;

public class ClienteRepositorio {
    private Cliente[] clientes = new Cliente[100];

    //construtor inicial
    public ClienteRepositorio() {
        this.clientes = new Cliente[100];
    }

    //métodos getters e setters

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    //adicionar cliente
    public void adicionarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                return;
            }
        }
    }

    //listar clientes
    public Cliente[] listarClientes() {
        return clientes;
    }

    //buscar cliente por id
    public Cliente buscarClientesPorId(String idCliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getIdCliente().equals(idCliente)) {
                return clientes[i];
            }
        }
        return null;
    }
    //buscar cliente por nome
    public Cliente buscarClientesPornome(String nome) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getNomeCliente().equals(nome)) {
                return clientes[i];
            }
        }
        return null;
    }
    //remover cliente
    public void removerClienteporId(String idCliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getIdCliente().equals(idCliente)) {
                clientes[i] = null;
            }
            return;
        }
    }
}