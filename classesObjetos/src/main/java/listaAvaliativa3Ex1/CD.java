
package listaAvaliativa3Ex1;


public class CD extends Midia{
    
    private int numMusicas;
    
    public CD(){};
    
    public CD(int c, double p, String n, int m){
        super.setCodigo(c);
        super.setPreco(p);
        super.setNome(n);
        this.numMusicas = m;
    }
    
    public int getNumMusicas() {
        return numMusicas;
    }

    public void setNumMusicas(int numMusicas) {
        this.numMusicas = numMusicas;
    }
  
    
    @Override
    public String getTipo(){
        return "CD";
    }
    
    @Override
    public String getDetalhes(){
        return "Codigo da media: " + super.getCodigo() + "\nPreco: " + super.getPreco() + 
                "\nNome: " + super.getNome() + "\nNumero de musicas: " + this.numMusicas;
    }
    
    public void inserirDados(int c, double p, String n, int m){
        super.setCodigo(c);
        super.setPreco(p);
        super.setNome(n);
        this.setNumMusicas(m);
    }
    
    @Override
    public void printDados(){
        System.out.println("Tipo: " + getTipo() + "\nDetalhes: \n" + getDetalhes());
    }

    
}