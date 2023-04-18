//exercicio 2
package exercicioMetodos;
   
public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro: " + getNome() + ", Preço: R$" + getPreco() + ", Autor: " + autor;
    }
}