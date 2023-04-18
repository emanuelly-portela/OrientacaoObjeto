//exercicio 2
package exercicioMetodos;

public class Cd extends Produto {
    private int numFaixas;

    public Cd(String nome, double preco, int numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    @Override
    public String toString() {
        return "Cd: " + getNome() + ", Preço: R$" + getPreco() + ", Número de faixas: " + numFaixas;
    }
}
