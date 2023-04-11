
package aplicacao;

import classes.Fatura;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        //instanciando a classe fatura - criação do objeto fatura
       Fatura fatura = new Fatura(quantidade);
       sc.nextLine();
       System.out.println("Digite a descricao");
       String descricao = sc.nextLine();
       fatura.setDescricao(descricao);
       
       System.out.println("Digite o preco do Item");
       int preco = sc.nextInt();
       fatura.setPrecoItem(preco);
       System.out.println(fatura.getPrecoItem());
       
       System.out.println("Digite o numero do item");
       int num = sc.nextInt();
       fatura.setNumero(num);
       
       double total = fatura.getTotalFatura();
        System.out.println(total);    
       
    }
    
}
