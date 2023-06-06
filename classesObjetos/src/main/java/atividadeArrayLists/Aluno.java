package atividadeArrayLists;

import java.util.List;

public class Aluno extends Pessoa {

    private Curso curso;
    private List<Double> notas;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : getNotas()) {
            soma = soma + nota;
        }
        double media = soma / notas.size();
        return media;
    }

    public void imprimir() {
        System.out.println("\n***DADOS ALUNO***\n");
        super.imprimir();
        getCurso().imprimirCursos();
        for (int i = 0; i < getNotas().size(); i++) {
            System.out.println(getNotas().get(i).toString());
        }
        System.out.println("\nMedia Final: " + calcularMedia());
    }
}
