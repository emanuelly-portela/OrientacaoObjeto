//Exercicio 1
package exercicioMetodos;

import java.time.LocalDate;

public class Pessoa {
    
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;
    
    
    public Pessoa(int diaNascimento, int mesNascimento, int anoNascimento, String nome){
    this.diaNascimento = diaNascimento;
    this.anoNascimento = anoNascimento;
    this.mesNascimento = mesNascimento; 
    this.nome = nome;
    this.idade = calculaIdade(diaNascimento, mesNascimento);
    }
    
    public final int calculaIdade(int diaAtual, int mesAtual){
    int idade = LocalDate.now().getYear() - this.anoNascimento;
    if (mesAtual < this.mesNascimento || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)){
        return idade--;
        }
      return idade;
    }

    public int informaIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + 
                diaNascimento + "/" + mesNascimento + "/" + 
                anoNascimento + ", Idade: " + idade;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

