package exercicio01;

public class TesteLivro {

    public static void main(String[] args) {
        try {
            Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);
            System.out.println("Livro criado com sucesso:");
            System.out.println("Nome: " + livro1.getNome());
            System.out.println("Autor: " + livro1.getAutor());
            System.out.println("Páginas: " + livro1.getPag());
            livro1.abrirLivro();
            livro1.lerPaginas();

            System.out.println();

            try {
                Livro livro2 = new Livro("", "George Orwell", 328);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar livro: " + e.getMessage());
            }

            System.out.println();

            try {
                Livro livro3 = new Livro("1984", "", 328);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar livro: " + e.getMessage());
            }

            System.out.println();

            try {
                Livro livro4 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 0);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar livro: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
