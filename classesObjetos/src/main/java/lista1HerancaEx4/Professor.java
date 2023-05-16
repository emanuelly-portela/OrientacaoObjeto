
package lista1HerancaEx4;


public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String sexo, String disciplina) {
        super(nome, idade, sexo);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
