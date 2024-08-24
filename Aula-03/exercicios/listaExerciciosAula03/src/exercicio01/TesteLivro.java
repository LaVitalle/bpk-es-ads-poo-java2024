package exercicio01;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A Torre Negra - A Escolha dos Três", "Stephen King", 500);

        livro1.numeroDePaginas = 20;

        System.out.println(livro1);
        livro1.abrirLivro();
        livro1.lerPagina();
        System.out.println("Pagina atual: " + livro1.getPaginaAtual());;
        System.out.println(livro1.livroAberto());
    }
}
