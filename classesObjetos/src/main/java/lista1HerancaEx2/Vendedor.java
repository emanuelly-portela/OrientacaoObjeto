//Lista 1 - herança. Ex.2
package lista1HerancaEx2;

public class Vendedor extends Empregado{
    private double salario;
    private String matricula;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo, salario, matricula);
        this.salario = salario;
        this.matricula = matricula;
        
     }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

 @Override
    public String toString() {
        return "Vendedor: nome=" + getNome() 
                + ", idade=" + getIdade() 
                + ", matricula=" + getMatricula();
     }
     
}
