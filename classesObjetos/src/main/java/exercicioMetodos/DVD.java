//exercicio 2
package exercicioMetodos;

public class DVD extends Produto {
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "DVD: " + getNome() + ", Preço: R$" + getPreco() + ", Duração: " + duracao + " minutos";
    }
}