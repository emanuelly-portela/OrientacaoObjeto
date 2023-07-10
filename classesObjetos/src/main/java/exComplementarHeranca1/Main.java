
package exComplementarHeranca1;


public class Main {

    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        
        r.setLength(-1);
        r.setWidth(10);
        
        System.out.println(r.area());
        System.out.println(r.perimetro());
    }
    
}