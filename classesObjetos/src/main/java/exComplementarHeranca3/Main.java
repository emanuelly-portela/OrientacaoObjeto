package exComplementarHeranca3;

public class Main {

    
    public static void main(String[] args) {
        CarroPasseio CdP = new CarroPasseio();
        Caminhao c = new Caminhao();
        
        CdP.insertData();
        c.insertData();
        System.out.println("\n");
        CdP.print();
        c.print();
    }
    
}