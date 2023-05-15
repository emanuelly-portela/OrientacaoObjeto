//Lista de Exercícios 4- P.O.O - Herança - Ex. 1
package lista1Heranca;

public class Peixe extends Animal{
    
    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    @Override
    public String toString() {
        return "Peixe: nome=" + getNome() 
                + ", peso=" + getPeso() 
                + ", tipoHabitat=" + tipoHabitat;
    }
 
}
