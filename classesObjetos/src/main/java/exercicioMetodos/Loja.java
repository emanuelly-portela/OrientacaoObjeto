//exercicio 2
package exercicioMetodos;

public class Loja {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Primo Rico", 30.0, "Thiago Nigro");
        Livro livro2 = new Livro("A ultima musica", 25.0, "Nicholas Sparks");
        Cd cd1 = new Cd("Madona", 35.0, 2);
        DVD dvd1 = new DVD("Harry Potter", 30.0, 178);
        DVD dvd2 = new DVD("Star Wars - Uma Nova Esperança", 35.0, 121);

        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(cd1.toString());
        System.out.println(dvd1.toString());
        System.out.println(dvd2.toString());
    }
}