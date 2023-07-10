package listaAvaliativa3Ex2;

import java.util.Scanner;

public class Moto extends Veiculo {
    
    private int ano;
    
    Scanner sc = new Scanner(System.in);
    
    public Moto(String n, double p, int a) {
        super(n, p);
        this.ano = a;
    }
    
    @Override
    public double getPreco(){
        return super.getPreco();
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    void insertData(){
        System.out.println("Modelo: ");
        super.setModelo(sc.nextLine());
        System.out.println("Preco: ");
        super.setPreco(sc.nextDouble());
        System.out.println("Ano: ");
        this.ano = sc.nextInt();
    }
    
}