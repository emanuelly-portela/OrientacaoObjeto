
package listaAvaliativa3Ex1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CD cd1 = new CD();
        DVD dvd1 = new DVD();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cadastrar CD:\n");
        System.out.println("Codigo:");
        cd1.setCodigo(sc.nextInt());
        System.out.println("Preco:");
        cd1.setPreco(sc.nextDouble());
        System.out.println("Nome: ");
        cd1.setNome(sc.nextLine());
        System.out.println("Numero de musicas:");
        cd1.setNumMusicas(sc.nextInt());
        
        System.out.println("Cadastrar DVD:\n");
        System.out.println("Codigo:");
        dvd1.setCodigo(sc.nextInt());
        System.out.println("Preco:");
        dvd1.setPreco(sc.nextDouble());
        System.out.println("Nome: ");
        dvd1.setNome(sc.nextLine());
        System.out.println("Numero de faixas:");
        dvd1.setNumFaixas(sc.nextInt());
        
        System.out.println("\n");
        sc.nextLine();
        
 
        dvd1.printDados();
        cd1.printDados();
        
    }
    
}