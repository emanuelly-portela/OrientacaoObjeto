package listaAvaliativa3Ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        char escolha;
        double totalPreco;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Deseja cadastrar um Carro ou uma Moto(C ou M)?: ");
        escolha = sc.next().charAt(0);
        
        switch(escolha){
        
            
        case 'c':
        System.out.println("Modelo do carro: ");
        String modeloC = sc.nextLine();
        System.out.println("Preco: ");
        double precoC = sc.nextDouble();
        System.out.println("Kilometragem: ");
        double kmC = sc.nextInt();
        Carro c = new Carro(modeloC, precoC, kmC);
                
        System.out.printf("Modelo: %s\nPreco: %.2f\nKilometragem: %.2f", modeloC, precoC, kmC);
                
        break;
            
        case 'm':
        System.out.println("Modelo da moto: ");
        String modeloM = sc.nextLine();
        System.out.println("Preco: ");
        double precoM = sc.nextDouble();
        System.out.println("Ano: ");
        int anoM = sc.nextInt();
        Moto mt = new Moto(modeloM, precoM, anoM);
                
        System.out.printf("Modelo: %s\nPreco: %.2f\nAno: %d", modeloM, precoM, anoM);
  
        break;
                
           default:
                break;
                
        }
               
       }
    }