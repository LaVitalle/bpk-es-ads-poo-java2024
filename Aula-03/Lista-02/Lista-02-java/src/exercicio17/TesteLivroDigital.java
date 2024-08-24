package exercicio17;

public class TesteLivroDigital
{
    public static void main(String[] args) {
        LivroDigital livro01 = new LivroDigital("Harry Potter", "Jorge", 50);
        livro01.abrirLivro();
        livro01.fecharLivro();
    }
}
