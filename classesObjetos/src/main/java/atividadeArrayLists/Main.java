package atividadeArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        createAlunos();

        createPrimeiroProfessor();
        createSegundoProfessor();
    }
    
    private static void createPrimeiroProfessor() {
        //****************** Criando primeiro professor*****************
        Professor professor = new Professor();
        professor.setNome("Edson Jesus");
        professor.setCpf("021045632598");
        professor.setEmail("edsonjesus@gmail.com");
        professor.setSalario(5888.0);
        professor.setTitulacao("Mestrado");

        Endereco endereco = new Endereco();
        endereco.setCidade("São Paulo");
        endereco.setEstado("Guarulhos");
        endereco.setRua("Vila São Vicente");
        professor.setEndereco(endereco);

        //criando lista de telefone
        List<Telefone> listTelefone = new ArrayList<>();
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("11");
        telefone.setNumero("986254878");

        listTelefone.add(telefone);
        professor.setTelefone(listTelefone);

        List<Curso> listCurso = new ArrayList<>();
        Curso curso = new Curso();
        curso.setNome("Medicina");

        Curso curso2 = new Curso();
        curso.setNome("Sistema da Informação");

        listCurso.add(curso);
        listCurso.add(curso2);
        professor.setCursos(listCurso);

        professor.imprimir();     
        
    }
    
    private static void createSegundoProfessor() {
        
        //****************** Criando segundo professor*****************
        Professor professor = new Professor();
        professor.setNome("Jose Matias");
        professor.setCpf("058456978945");
        professor.setEmail("josematias@gmail.com");
        professor.setSalario(6200.0);
        professor.setTitulacao("Doutorado");

        Endereco endereco = new Endereco();
        endereco.setCidade("São Paulo");
        endereco.setEstado("Guarulhos");
        endereco.setRua("Vila São Vicente");
        professor.setEndereco(endereco);

        //criando lista de telefone
        List<Telefone> listTelefone = new ArrayList<>();
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("11");
        telefone.setNumero("986254878");

        listTelefone.add(telefone);
        professor.setTelefone(listTelefone);

        List<Curso> listCurso = new ArrayList<>();
        Curso curso = new Curso();
        curso.setNome("Medicina");

        Curso curso2 = new Curso();
        curso.setNome("Sistema da Informação");

        listCurso.add(curso);
        listCurso.add(curso2);
        professor.setCursos(listCurso);

        professor.imprimir(); 
    }

    private static void createAlunos() {
        //****************** Criando primeiro aluno*****************
        Aluno aluno = new Aluno();
        aluno.setNome("Miguel");
        aluno.setCpf("12345678909");
        aluno.setEmail("miguel@gmail.com");

        Endereco endereco = new Endereco();
        endereco.setCidade("Brasilia");
        endereco.setEstado("Distrito Federal");
        endereco.setRua("Santa MAria");

        aluno.setEndereco(endereco);

        //criando lista de telefone
        List<Telefone> listTelefone = new ArrayList<>();
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("61");
        telefone.setNumero("9999888222");

        listTelefone.add(telefone);

        aluno.setTelefone(listTelefone);//guardar telefone digitado no aluno1

        Curso curso = new Curso();
        curso.setNome("Engenharia de software");
        aluno.setCurso(curso);

        List<Double> notas = new ArrayList<>();//criando lista de notas para o aluno1
        notas.add(8.0);
        notas.add(9.0);
        notas.add(7.0);

        aluno.setNotas(notas);//guardar notas digitado para o aluno1

        aluno.imprimir();

//****************** Criando Segundo aluno*****************
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Gabriel");
        aluno2.setCpf("2345656789");
        aluno2.setEmail("gabriel@gmail.com");

        Endereco endereco2 = new Endereco();
        endereco2.setCidade("Guarulhos");
        endereco2.setEstado("São Paulo");
        endereco2.setRua("Alfredo");

        aluno2.setEndereco(endereco2);

        List<Telefone> listTelefone2 = new ArrayList<>();
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("celular");
        telefone2.setDdd("11");
        telefone2.setNumero("9999888222");

        listTelefone2.add(telefone);

        aluno2.setTelefone(listTelefone2);

        Curso curso2 = new Curso();
        curso2.setNome("Medicina");
        aluno2.setCurso(curso2);

        List<Double> notas2 = new ArrayList<>();
        notas2.add(8.0);
        notas2.add(10.0);
        notas2.add(9.0);

        aluno2.setNotas(notas2);

        aluno2.imprimir();
    }
}
