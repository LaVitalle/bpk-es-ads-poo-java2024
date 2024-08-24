package exercicio01;

public class TesteLivro {

    public static void main(String[] args) {
        Livro livro = new Livro("A Torre Negra - A Escolha dos Três",
                "Stephen King",
                600 );

        Livro livro2 = new Livro("Harry Potter e a Ordem da Fênix",
                "JK Rowling", 500);

        System.out.println(livro);
        System.out.println(livro2);

        Livro livro3 = new Livro();
        System.out.println(livro3);

    }
}
