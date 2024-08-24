package exercicio07;

public class Aluno
{

    String nome;
    String matricula;
    String curso;
    int N1;
    int N2;
    int N3;

    public Aluno(String nome, String matricula, String curso, Integer N1, Integer N2, Integer N3)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
    }

    public void mediaAluno()
    {
        System.out.println("Média: " + ((N1+N2+N3)/3));
    }
}