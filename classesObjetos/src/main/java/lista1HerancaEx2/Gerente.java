//Lista 1 - herança. Ex.2
package lista1HerancaEx2;

public class Gerente extends Empregado {
    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente: nome=" + getNome() 
                + ", idade=" + getIdade() 
                + ", matricula=" + getMatricula();
     }
    
}