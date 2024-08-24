package exercicio01;

public class Livro
{

    String nome;
    String autor;
    int pag;

    public Livro(String nome, String autor, int pag)
    {
        this.nome = nome;
        this.autor = autor;
        this.pag = pag;
    }

   public void abrirLivro()
   {

       System.out.println("exercicio01.Livro " + nome + " foi aberto!!");

   }

    public void lerPaginas()
    {
        for (int i = 1; i <=this.pag; i++)
       {
           System.out.println("Leu a página: " + i);
        }
    }
}