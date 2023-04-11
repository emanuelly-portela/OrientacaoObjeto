
package classes;

public class Fatura {
    //atributos de instancia
    private String descricao;
    private int numero;
    private int qtd;
    private double precoItem;
    //metodo construtor sem argumentos;
    public Fatura(){
        
    }
    //metodo construtor com argumentos;
    public Fatura(int qtd){
        setQtd(qtd);
    }
    public void setDescricao(String descricao){
        //logica de acesso aos atributos
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        if(qtd > 0){
            this.qtd = qtd;
      }else{
            System.out.println("Valor inválido");
        }
    }
    public double getPrecoItem() {
        return precoItem;
    }
    public void setPrecoItem(double precoItem) {
        if(precoItem <= 0){
            this.precoItem = 0.0;
        }else{
            this.precoItem = precoItem;
        }
    }
    public Double getTotalFatura(){
        double total = qtd * precoItem;
        if(total <= 0){
            total = 0;
        }
        return total;
    }
}
