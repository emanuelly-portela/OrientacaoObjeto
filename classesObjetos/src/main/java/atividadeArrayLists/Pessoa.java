package atividadeArrayLists;

import java.util.List;

public class Pessoa {

    private String nome, cpf, email;
    private Endereco endereco;
    private List<Telefone> telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public void imprimir() {
        System.out.println("\n***Pessoa***\nNome:  " + getNome()
                + "\nCPF:  " + getCpf()
                + "\nEmail:  " + getEmail());
        getEndereco().imprimirEndereco();

        for (int i = 0; i < getTelefone().size(); i++) {
            getTelefone().get(i).imprimirTelefone();
        }
    }
}
