
package exComplementarHeranca3;


import java.util.Scanner;

public class CarroPasseio extends Veiculo {
    String cor, modelo;
    
    Scanner sc = new Scanner(System.in);
    
    CarroPasseio(){}
    
    CarroPasseio(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }
    
    @Override
    public void insertData(){
        System.out.println("Numeros de cilindros: ");
        super.numCilindros = sc.nextInt();
        System.out.println("Potencia: ");
        super.potencia = sc.nextInt();
        System.out.println("Peso: ");
        peso = sc.nextInt();
        System.out.println("Velodidade maxima: ");
        velocidadeMx = sc.nextInt();
        System.out.println("Preco: ");
        preco = sc.nextInt();
        System.out.println("Cor: ");
        cor = sc.nextLine();
        System.out.println("Modelo: ");
        modelo = sc.nextLine();
    }
    
    @Override
    public void print(){
        System.out.printf("Numero de cilindros: %d\nPotencia: %d\nPeso: %d\nVelocidade maxima: %d\nPreco: %.2f\nCor: %s\nModelo: %s\n",
                numCilindros, potencia, peso, velocidadeMx, preco, cor, modelo);
    }
}