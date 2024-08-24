package exercicio08;

public class Professor
{

    String nome;
    String disciplina;
    Double salario;

    public Professor(String nome, String disciplina, Double salario)
    {

        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;

    }

    public void darAula()
    {
        System.out.println("Deu aula!!");
    }

    public void corrigirProv()
    {
        System.out.println("Corrigiu prova!!");
    }
}