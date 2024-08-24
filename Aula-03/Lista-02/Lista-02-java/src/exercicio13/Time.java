package exercicio13;

public class Time
{

    String nome;
    String tecnico;
    Integer numJoga;

    public Time(String nome, String tecnico, Integer numJoga)
    {

        this.nome = nome;
        this.tecnico = tecnico;
        this.numJoga = numJoga;

    }

    public void morenumJoga()
    {
        numJoga++;
        System.out.println(numJoga);
    }
    public void lessnumJoga()
    {
        numJoga--;
        System.out.println(numJoga);
    }

}
