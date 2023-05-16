
package lista1HerancaEx4;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, String sexo, int matricula) {
        super(nome, idade, sexo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}
