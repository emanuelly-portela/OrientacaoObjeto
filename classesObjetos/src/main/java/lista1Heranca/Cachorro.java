//Lista de Exercícios 4- P.O.O - Herança - Ex. 1
package lista1Heranca;


public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

   
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    @Override
    public String toString() {
        return "Cachorro: nome=" + getNome() + ", peso=" + getPeso() + ", raca=" + raca;
    }
}
