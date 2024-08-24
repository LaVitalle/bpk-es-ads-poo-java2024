package exercicio17;

public class LivroDigital
{

    String nome;
    String autor;
    int tamArq;

    public LivroDigital(String nome, String autor, int tamArq)
    {
        this.nome = nome;
        this.autor = autor;
        this.tamArq = tamArq;
    }

    public void abrirLivro()
    {

        System.out.println("exercicio01.Livro " + nome + " foi aberto!!");

    }
    public void fecharLivro()
    {

        System.out.println("exercicio01.Livro " + nome + " foi fechado!!");

    }

}