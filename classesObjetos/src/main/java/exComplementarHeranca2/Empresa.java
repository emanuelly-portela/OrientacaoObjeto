
package exComplementarHeranca2;

import java.util.Scanner;

public class Empresa {
    String nome, endereco, cidade, estado, cep, fone;
    
    Scanner sc = new Scanner(System.in);
    
    Empresa(){}
    
    Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone){
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }
    
    public void insert(){
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Endereco: ");
        endereco = sc.nextLine();
        System.out.println("Cidade: ");
        cidade =sc.nextLine();
        System.out.println("Estado: ");
        estado = sc.nextLine();
        System.out.println("CEP: ");
        cep =sc.nextLine();
        System.out.println("Fone: ");
        fone = sc.nextLine();
    }
    
    public void print(){
        System.out.printf("Nome: %s\nEndereco: %s\nCidade: %s\nEstado: %s\nCEP: %s\nFone: %s\n", nome, endereco, cidade, estado, cep, fone);
    }
    
    
}