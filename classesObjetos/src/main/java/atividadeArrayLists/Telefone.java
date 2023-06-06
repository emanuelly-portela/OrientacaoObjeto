
package atividadeArrayLists;

public class Telefone {
    
    private String tipo, ddd, numero;

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
 public void imprimirTelefone(){
     System.out.println("\n***Telefone***\n Tipo:" +getTipo()
                        +"\nNumero:"+getDdd()+")"
                        + ""+ getNumero());
     
    }    
 }
