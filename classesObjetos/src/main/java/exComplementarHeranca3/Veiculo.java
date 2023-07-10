package exComplementarHeranca3;

import java.util.Scanner;

public class Veiculo extends Motor{
    int peso, velocidadeMx;
    float preco;
    
    Scanner sc = new Scanner(System.in);
    
    Veiculo(){}
    
    Veiculo(int peso, int velocidadeMax, float preco){
        this.peso = peso;
        this.velocidadeMx = velocidadeMax;
        this.preco = preco;
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
        System.out.println("Prec: ");
        preco = sc.nextInt();
    }
    
    @Override
    public void print(){
        System.out.printf("Numero de cilindros: %d\nPotencia: %d\nPeso: %d\nVelocidade maxima: %d\nPreco: %.2f",
                numCilindros, potencia, peso, velocidadeMx, preco);
    }
}