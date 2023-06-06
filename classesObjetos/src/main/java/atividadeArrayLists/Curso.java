package atividadeArrayLists;

public class Curso {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirCursos() {
        System.out.println("\n ***CURSO*** \nNome:" + getNome());
    }
}
