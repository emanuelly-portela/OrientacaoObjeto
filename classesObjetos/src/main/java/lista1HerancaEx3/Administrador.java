
package lista1HerancaEx3;

    public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario(){
        return super.getSalarioBase() + this.ajudaDeCusto; 
    }
    
}