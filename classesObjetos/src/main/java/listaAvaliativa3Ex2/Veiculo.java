
package listaAvaliativa3Ex2;

public class Veiculo {
    
    private String modelo;
    private double preco;
    
    public Veiculo(String nome, double preco){
        this.modelo = nome;
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void printDados(){
        System.out.printf("Modelo: %s\nPreco: %.2f", getModelo(), getPreco());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}