package exComplementarHeranca2;

public class Restaurante extends Empresa{
    String tipoComida;
    double precoMedio;
    
    Restaurante(){}
    
    Restaurante(String tipoComida, double precoMedio){
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }
    

    @Override
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
        System.out.println("Tipo de comida: ");
        tipoComida = sc.nextLine();
        System.out.println("Preco medio: ");
        precoMedio = sc.nextDouble();
    }
    
    @Override
    public void print(){
        System.out.printf("Nome: %s\nEndereco: %s\nCidade: %s\nEstado: %s\nCEP: %s\nFone: %s\nTipo de comida: %s\nPreco medio: %.2f\n", 
                nome, endereco, cidade, estado, cep, fone, tipoComida, precoMedio);
    }
}