
package exComplementarHeranca3;

import java.util.Scanner;

public class Caminhao extends Veiculo {
    int alturaMax, comprimento, toneladas;
    
    Scanner sc = new Scanner(System.in);
    
    Caminhao(){
        this.alturaMax = 0;
        this.comprimento = 0;
        this.toneladas = 0;
    }
    Caminhao(int alturaMax, int comprimento, int toneladas){
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
        this.toneladas = toneladas;
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
        System.out.println("Altura maxima: ");
        alturaMax =  sc.nextInt();
        System.out.println("Comprimento: ");
        comprimento = sc.nextInt();
        System.out.println("Carga maxima (em toneladas): ");
        toneladas = sc.nextInt();
    }
    
    @Override
    public void print(){
        System.out.printf("Numero de cilindros: %d\nPotencia: %d\nPeso: %d\nVelocidade maxima: %d\nPreco: %.2f\nAltura maxima: %d\nComprimento: %d\nCarga maxima: %d/n",
                numCilindros, potencia, peso, velocidadeMx, preco, alturaMax, comprimento, toneladas);
    }
}