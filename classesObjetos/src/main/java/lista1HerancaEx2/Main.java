//Lista 1 - herança. Ex.2
package lista1HerancaEx2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Roberto", 40, "Masculino", 700.0, 1990);
        System.out.println(cliente.toString());

        Empregado empregado = new Empregado("Rafaela", 38, "Feminino", 2800.0, "12345");
        System.out.println(empregado.toString());

        Gerente gerente = new Gerente("Ricardo", 43, "Masculino", 6000.0, "54321", "Vendas");
        System.out.println(gerente.toString());
        
        Vendedor vendedor = new Vendedor("Gabriel", 35, "Masculino", 2.500, "23156");
        System.out.println(vendedor.toString());
    }
    
}
