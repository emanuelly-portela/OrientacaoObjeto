
package aplicacao;

import classes.Empregado;
import java.util.Scanner;

public class MainEmpregado {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        Empregado empregado = new Empregado();
        System.out.println("Digite a nome");
        String nome = sc.nextLine();
        empregado.setNome(nome);
        
        System.out.println("Digite o sobrenome");
        String sobrenome = sc.nextLine();
        empregado.setSobrenome(sobrenome);
        
        System.out.println("Digite o salario");
        Double salario = sc.nextDouble();
        Double aumento = (salario * 10)/100;
        empregado.setSalario(aumento + salario);
        
        System.out.println("Valor com aumento -> " + empregado.getSalario());
        System.out.println("Salario anual de cada empregado -> " + (empregado.getSalario()*12));
        
            
        Empregado empregado2 = new Empregado();
        System.out.println("Digite a nome");
        String nome2 = sc.nextLine();
        empregado2.setNome(nome2);
        
        System.out.println("Digite o sobrenome");
        String sobrenome2 = sc.nextLine();
        empregado2.setSobrenome(sobrenome2);
        
        System.out.println("Digite o salario");
        Double salario2 = sc.nextDouble();
        Double aumento2 = (salario2 * 10)/100;
        empregado2.setSalario(aumento2 + salario2);
        
        System.out.println("Valor com aumento Empregado 2 -> " + empregado2.getSalario());
        System.out.println("Salario anual de cada empregado 2 -> " + (empregado2.getSalario()*12));

    }
 
}
