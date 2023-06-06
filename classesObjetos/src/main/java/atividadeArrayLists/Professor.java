package atividadeArrayLists;

import java.util.List;

public class Professor extends Pessoa {

    private String titulacao;
    private double salario;
    private List<Curso> cursos;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public void imprimir() {
        System.out.println("\n***DADOS PROFESSOR***\n");
        super.imprimir();
        
        System.out.println("Titulacao: " + getTitulacao()
                       + "\nSalario: " + getSalario());
        
        for (int i = 0; i < getCursos().size(); i++) {
            getCursos().get(i).imprimirCursos();
        }
    }
}
