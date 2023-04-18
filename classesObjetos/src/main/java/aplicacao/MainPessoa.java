
package aplicacao;

import exercicioMetodos.Pessoa;

public class MainPessoa {
    
    public static void main(String[] args) {
        Pessoa albert = new Pessoa(14,3,1879, "Albert Einstein");
        
        Pessoa isaac = new Pessoa(4,1,1643, "Isaac Newton");
        
        System.out.println(albert.toString());
        System.out.println(isaac.toString());
       
        
    }
    
}
