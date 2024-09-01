package exercicio12;

public class Filme
{

    String titulo;
    String diretor;
    String duracao;

    public Filme(String titulo, String diretor, String duracao)
    {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
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