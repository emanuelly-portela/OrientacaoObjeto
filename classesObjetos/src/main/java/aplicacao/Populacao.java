
package aplicacao;

import java.util.Scanner;

/**
 *
 *
 */

public class Populacao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int qtdMulheresCastanhas = 0; // contador de mulheres com olhos e cabelos castanhos
        int qtdMulheres = 0; // contador de mulheres cadastradas
        
        // Entrada de dados dos habitantes
        while (true) {
            
            System.out.print("Digite o sexo (m/f): ");
            char sexo = sc.next().charAt(0);
            if (sexo == 'm' || sexo == 'f') {
                
                System.out.print("Digite a cor dos olhos (a, v, c, p): ");
                char corOlhos = sc.next().charAt(0);
                if (corOlhos == 'a' || corOlhos == 'v' || corOlhos == 'c' || corOlhos == 'p') {
                    
                    System.out.print("Digite a cor dos cabelos (l, c, p, r): ");
                    char corCabelos = sc.next().charAt(0);
                    if (corCabelos == 'l' || corCabelos == 'c' || corCabelos == 'p' || corCabelos == 'r') {
                        
                        System.out.print("Digite a idade em anos: ");
                        int idade = sc.nextInt();
                        if (idade >= 10 && idade <= 100) {
                            
                            System.out.print("Digite o valor do salário: ");
                            double salario = sc.nextDouble();
                            if (salario >= 0) {
                                
                                if (sexo == 'f' && corOlhos == 'c' && corCabelos == 'c' && idade >= 18 && idade <= 35) {
                                    qtdMulheresCastanhas++;
                                }
                                if (sexo == 'f') {
                                    qtdMulheres++;
                                }
                                if (idade == -1) { // fim da pesquisa
                                break;
                                }
                                
                            } else {
                                System.out.println("Valor do salário inválido!");
                            }
                            
                        } else {
                            System.out.println("Idade inválida!");
                        }
                        
                    } else {
                        System.out.println("Cor dos cabelos inválida!");
                    }
                    
                } else {
                    System.out.println("Cor dos olhos inválida!");
                }
                
            } else {
                System.out.println("Sexo inválido!");
            }
            
        }
        
        // Cálculo da porcentagem de mulheres com olhos e cabelos castanhos
        double porcentagemMulheresCastanhas = (double) qtdMulheresCastanhas / qtdMulheres * 100;
        System.out.printf("Porcentagem de mulheres com olhos e cabelos castanhos: %.2f%%", porcentagemMulheresCastanhas);
        
        sc.close();
    }
}
