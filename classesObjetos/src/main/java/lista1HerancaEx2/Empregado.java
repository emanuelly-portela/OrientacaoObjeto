//Lista 1 - herança. Ex.2
package lista1HerancaEx2;


public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorInss() {
        return salario * 0.11;
    }

    @Override
    public String toString() {
        return "Empregado: nome=" + getNome() 
                + ", idade=" + getIdade() 
                + ", matricula=" + matricula 
                + ", valorInss=" + valorInss();
    }
}
