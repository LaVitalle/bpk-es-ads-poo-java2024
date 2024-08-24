package exercicio14;

public class Jogo
{

    String nome;
    String genero;
    Double preco;

    public Jogo(String nome, String genero, Double preco)
    {

        this.nome = nome;
        this.genero = genero;
        this.preco = preco;

    }

    public void start()
    {
        System.out.println("Começou!!");
    }
    public void stop()
    {
        System.out.println("Parou!!");
    }

}