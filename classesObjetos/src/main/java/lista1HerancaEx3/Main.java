//lista 1 Herança ex.3
package lista1HerancaEx3;

public class Main {
    public static void main(String[] args) {
       Fornecedor fornecedor = new Fornecedor("João", "Rua A, 123", "123456789", 1000.0, 500.0);
        System.out.println(fornecedor.toString());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
        
        System.out.println("*****************************************");
        Empregado empregado = new Empregado("Maria", "Rua B, 456", "987654321", 123, 2000.0, 10.0);
        System.out.println(empregado.toString());
        System.out.println("Salário: " + empregado.calcularSalario());
    }
}