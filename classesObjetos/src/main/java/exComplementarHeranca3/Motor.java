
package exComplementarHeranca3;

import java.util.Scanner;

public class Motor {
    int numCilindros, potencia;
    
    Scanner sc = new Scanner(System.in);
    
    Motor(){
        numCilindros = 0;
        potencia = 0;
    }
    
    Motor(int numCilindros, int potencia){
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }
    
    public void insertData(){
        System.out.println("Numneros de cilindros: ");
        numCilindros = sc.nextInt();
        System.out.println("Potencia: ");
        potencia = sc.nextInt();
    }
    
    public void print(){
        System.out.printf("Numero de cilindros: %d\nPotencia: %d\n", numCilindros, potencia);
    }
    
}