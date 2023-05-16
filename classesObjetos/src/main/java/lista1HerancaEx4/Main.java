package lista1HerancaEx4;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Mario", 35, "Masculino", "Programação");
        Disciplina disciplina = new Disciplina("Introdução à Programação", professor);
        Aluno aluno = new Aluno("Gabriela", 20, "Feminino", 12345);

        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Professor: " + disciplina.getProfessor().getNome());
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
    }
}