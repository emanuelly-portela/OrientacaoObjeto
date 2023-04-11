
package aplicacao;

import java.util.Scanner;

/**
 * Atividades - Introdução à linguagem Java
 *Instruções
 1. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
* mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
* Escrever um algoritmo que leia o número de carros por ele vendidos, 
* o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. 
* Calcule e escreva o salário final do vendedor.
*/
public class RevendedoraCarro {
            
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);         
         System.out.println("Digite o salario:");
         double salario = sc.nextDouble();
         
         System.out.println("Digite o valor total de venda:");
         double totalVenda = sc.nextDouble();
         
         double comissao = (totalVenda*5)/100;
         
         System.out.println("O valor do salario e comissão é " + (salario+comissao));
         
    }
 
}
