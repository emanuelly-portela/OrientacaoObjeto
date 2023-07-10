/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaAvaliativa3Ex1;

public class DVD extends Midia{
    private int numFaixas;
    
    public DVD(){};
    
    public DVD(int c, double p, String n, int f){
        super.setCodigo(c);
        super.setPreco(p);
        super.setNome(n);
        this.numFaixas = f;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
    @Override
    public String getTipo(){
        return "DVD";
    }
    
    @Override
    public String getDetalhes(){
        return "Codigo da media: " + super.getCodigo() + "\nPreco: " + super.getPreco() + 
                "\nNome: " + super.getNome() + "\nNumero de faixas: " + this.numFaixas;
    }
    
    public void inserirDados(int c, double p, String n, int f){
        super.setCodigo(c);
        super.setPreco(p);
        super.setNome(n);
        this.setNumFaixas(f);
    }
    
    @Override
    public void printDados(){
        System.out.println("Tipo: " + getTipo() + "\nDetalhes: \n" + getDetalhes());
    }
    
    
}