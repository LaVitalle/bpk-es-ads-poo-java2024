package exercicio05;

public class Cachorro
{

    String nome;
    String raca;
    Integer idade;

    public Cachorro(String nome, String raca, Integer idade)
    {

        this.nome = nome;
        this.raca = raca;
        this.idade = idade;

    }

    public void latir()
    {
        System.out.println("Latiu");
    }

    public void correr()
    {
        System.out.println("Correu");
    }
}