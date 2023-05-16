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
        
        System.out.println("*****************************************");
        Administrador administrador = new Administrador("Jose", "Qd 05 bloco B cs05", "911111268", 321, 2500.0, 11.0);
        System.out.println(administrador.toString());
        System.out.println("Obter saldo: " + administrador.calcularSalario());
        
        System.out.println("*****************************************");
        Operario operario = new Operario("joao", "Qd 5 bl C cs 25", "916666698", 564, 2600.00, 15.0);
        System.out.println( operario.toString());
        System.out.println("Salário Base: " + operario.calcularSalario());
        
        System.out.println("*****************************************");
        Vendedor vendedor = new Vendedor ("Mario", "Rua11 casa 22", "962222553", 589, 3500.0, 12.0);
        System.out.println(vendedor.toString());
        System.out.print("Calcular Salário: "+ vendedor.calcularSalario());
    }
}