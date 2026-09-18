package repositorio;

import modelo.Funcionario;

public class FuncionarioRepositorio {
    private int proximaPosicaoLivre;
    private Funcionario[] funcionarios = new Funcionario[50];

    //construtor inicial
    public FuncionarioRepositorio() {
        this.proximaPosicaoLivre = 0;
        this.funcionarios = new Funcionario[100];
    }

    //métodos getters e setters
    public int getProximaPosicaoLivre() {
        return proximaPosicaoLivre;
    }

    public void setProximaPosicaoLivre(int proximaPosicaoLivre) {
        this.proximaPosicaoLivre = proximaPosicaoLivre;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    //adicionar funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios[proximaPosicaoLivre] = funcionario;
        proximaPosicaoLivre++;
    }

    //listar funcionários
    public Funcionario[] listarFuncionarios() {
        return funcionarios;
    }

    //buscar funcionário por id
    public Funcionario buscarFuncionarioPorId(String idFuncionario) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (funcionarios[i] != null && funcionarios[i].getIdFuncionario().equals(idFuncionario)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    //buscar funcionário por nome
    public Funcionario buscarFuncionarioPorNome(String nomeFuncionario) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (funcionarios[i] != null && funcionarios[i].getNomeFuncionario().equalsIgnoreCase(nomeFuncionario)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    //remover funcionário
    public boolean removerFuncionario(String idFuncionario) {
        for (int i = 0; i < proximaPosicaoLivre; i++) {
            if (funcionarios[i] != null && funcionarios[i].getIdFuncionario().equals(idFuncionario)) {
                for (int j = i; j < proximaPosicaoLivre - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[proximaPosicaoLivre - 1] = null;
                    proximaPosicaoLivre--;
                    return true;
                }
            }
        }
        return false;
    }
}