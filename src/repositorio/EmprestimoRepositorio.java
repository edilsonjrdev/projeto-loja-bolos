package repositorio;
import modelo.Emprestimo;
import modelo.Produto;

public class EmprestimoRepositorio {
    Emprestimo[] emprestimos;

    //contrutor inicial
    public EmprestimoRepositorio() {
        this.emprestimos =  new Emprestimo[1000];
    }

    //métodos getters e setters

    public Emprestimo[] getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimo[] emprestimos) {
        this.emprestimos = emprestimos;
    }

    //adicionar emprestimo
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] == null) {
                emprestimos[i] = emprestimo;
                return;
            }
        }
    }

    //listar emprestimos

    public Emprestimo[] listarEmprestimos() {
        return emprestimos;
    }

    //buscar emprestimos
    public Emprestimo buscarEmprestimosPorId(String idEmprestimo) {
        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] != null && emprestimos[i].getIdEmprestimo().equals(idEmprestimo)) {
                return emprestimos[i];
            }
        }
        return null;
    }

    //remover emprestimos
    public void removerEmprestimosporId(String idEmprestimo) {
        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] != null && emprestimos[i].getIdEmprestimo().equals(idEmprestimo)) {
                emprestimos[i] = null;
            }
            return;
        }
    }

}
