
package lista1HerancaEx3;

public class Operario extends Empregado{
    private double salarioBase;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, comissao);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario(){
        return super.getSalarioBase() + (this.salarioBase * comissao);
    }

    @Override
    public String toString() {
        return "Operario{" + "valorProducao=" + salarioBase + ", comissao=" + comissao + '}';
    }
    
}