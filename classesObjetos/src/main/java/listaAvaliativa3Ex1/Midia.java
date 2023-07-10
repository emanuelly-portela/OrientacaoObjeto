
package listaAvaliativa3Ex1;


public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    
    public Midia(){};
    
    public Midia(int c, double p, String n){
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo(){
        return "Media";
    }
    
    public String getDetalhes(){
        return "Codigo da media: " + this.getCodigo() + "\nPreco: " + this.getPreco() + "\nNome: " + this.getNome();
    }
    
    public void inserirDados(int c, double p, String n){
        this.setCodigo(c);
        this.setPreco(p);
        this.setNome(n);
    }
    
    public void printDados(){
        System.out.println("Tipo: " + getTipo() + "\nDetalhes: \n" + getDetalhes());
    }

    
}