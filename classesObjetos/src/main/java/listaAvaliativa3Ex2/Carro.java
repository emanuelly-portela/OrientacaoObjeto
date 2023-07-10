package listaAvaliativa3Ex2;

import java.util.Scanner;

public class Carro extends Veiculo{
    
    private double km;
    
    Scanner sc = new Scanner(System.in);
    
    
    public Carro(String n, double p, double k){
        super(n, p);
        this.km = k;
    }
    
    @Override
    public double getPreco(){
        return super.getPreco();
    }
    
    void setKm(Double km){
        this.km = km;
    }
    
    void insertData(){
        System.out.println("Modelo: ");
        super.setModelo(sc.nextLine());
        System.out.println("Preco: ");
        super.setPreco(sc.nextDouble());
        System.out.println("KM: ");
        this.km = sc.nextDouble();
    }
}