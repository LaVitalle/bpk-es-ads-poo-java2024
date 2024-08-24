package exercicio11;

public class Cidade
{

    String nome;
    Integer pop;
    String estado;

    public Cidade(String nome, Integer pop, String estado)
    {
        this.nome = nome;
        this.pop = pop;
        this.estado = estado;
    }

    public void morePop()
    {
        pop++;
        System.out.println(pop);
    }
    public void lessPop()
    {
        pop--;
        System.out.println(pop);
    }

}