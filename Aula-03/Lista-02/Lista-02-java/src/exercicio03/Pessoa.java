package exercicio03;

public class Pessoa
{

    String nome;
    int idade;
    Double alt;

    public void imprimePes()
    {
        System.out.println("Eu sou o " + nome + ", tenho " + idade + " anos e tenho " + alt + " de altura");
    }

    public Pessoa(String nome, int idade, Double alt)
    {

        this.nome = nome;
        this.idade = idade;
        this.alt = alt;

    }
}