package exercicio17;

public class TesteLivroDigital {

    public static void main(String[] args) {
        try {
            LivroDigital livro1 = new LivroDigital("A Arte da Guerra", "Sun Tzu", 1024);
            System.out.println("Livro digital criado com sucesso:");
            System.out.println("Nome: " + livro1.getNome());
            System.out.println("Autor: " + livro1.getAutor());
            System.out.println("Tamanho do Arquivo: " + livro1.getTamArq() + " KB");
            livro1.abrirLivro();
            livro1.fecharLivro();

            System.out.println();

            try {
                LivroDigital livro2 = new LivroDigital("", "Autor Desconhecido", 500);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar livro digital: " + e.getMessage());
            }

            System.out.println();

            try {
                LivroDigital livro3 = new LivroDigital("Título Válido", "", 800);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar livro digital: " + e.getMessage());
            }

            System.out.println();

            try {
                LivroDigital livro4 = new LivroDigital("Título Válido", "Autor Válido", -100);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar livro digital: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
