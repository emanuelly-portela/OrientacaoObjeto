//Lista de Exercícios 4- P.O.O - Herança - Ex. 1
package lista1Heranca;


public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Tucunaré", 0.8, "Rio");
        Cachorro cachorro = new Cachorro("PIt", 12.2, "Pincher");

        System.out.println(peixe.toString());
        System.out.println(cachorro.toString());
    }
}
