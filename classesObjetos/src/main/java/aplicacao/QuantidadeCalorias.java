
package aplicacao;

import java.util.Scanner;

/**
 *Atividades - Introdução à linguagem Java
 *2. Criar um algoritmo que informe a quantidade total de calorias 
 * de uma refeição a partir do usuário que deverá informar o prato, 
 * a sobremesa e a bebida (veja a tabela a seguir). 
 * Enumere cada opção de prato, sobremesa e bebida.
Prato: 1 - vegetariano, 2 – Peixe, 3 – Frango, 4 – Carne;
Sobremesa: 1 – Abacaxi, 2 – Sorvete diet, 3 – Mouse diet, 4 – Mouse chocolate;
Bebida: 1 – Chá, 2 - Suco de laranja, 3 – Suco de melão, 4 – Refrigerante diet. 
 */
public class QuantidadeCalorias {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o prato escolhido:");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        int pratoEscolhido = scanner.nextInt();

        System.out.println("Informe a sobremesa escolhida:");
        System.out.println("1 - Abacaxi");
        System.out.println("2 - Sorvete diet");
        System.out.println("3 - Mousse diet");
        System.out.println("4 - Mousse chocolate");
        int sobremesaEscolhida = scanner.nextInt();

        System.out.println("Informe a bebida escolhida:");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melão");
        System.out.println("4 - Refrigerante diet");
        int bebidaEscolhida = scanner.nextInt();

        int caloriasTotais = Prato.values()[pratoEscolhido - 1].getCalorias() +
                             Sobremesa.values()[sobremesaEscolhida - 1].getCalorias() +
                             Bebida.values()[bebidaEscolhida - 1].getCalorias();

        System.out.println("A refeição escolhida tem um total de " + caloriasTotais + " calorias.");
    }
    
     enum Prato {
        VEGETARIANO(180),
        PEIXE(230),
        FRANGO(250),
        CARNE(350);

        private int calorias;

        Prato(int calorias) {
            this.calorias = calorias;
        }

        public int getCalorias() {
            return calorias;
        }
    }

    enum Sobremesa {
        ABACAXI(75),
        SORVETE_DIET(110),
        MOUSSE_DIET(170),
        MOUSSE_CHOCOLATE(200);

        private int calorias;

        Sobremesa(int calorias) {
            this.calorias = calorias;
        }

        public int getCalorias() {
            return calorias;
        }
    }

    enum Bebida {
        CHA(20),
        SUCO_LARANJA(70),
        SUCO_MELAO(100),
        REFRIGERANTE_DIET(65);

        private int calorias;

        Bebida(int calorias) {
            this.calorias = calorias;
        }

        public int getCalorias() {
            return calorias;
        }
    }
}
