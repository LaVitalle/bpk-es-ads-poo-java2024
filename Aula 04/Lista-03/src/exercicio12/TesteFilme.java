package exercicio12;

public class TesteFilme {

    public static void main(String[] args) {
        try {
            Filme filme1 = new Filme("Inception", "Christopher Nolan", "148 min");
            System.out.println("Filme criado com sucesso:");
            System.out.println("Título: " + filme1.getTitulo());
            System.out.println("Diretor: " + filme1.getDiretor());
            System.out.println("Duração: " + filme1.getDuracao());
            filme1.start();
            filme1.stop();

            System.out.println();

            try {
                Filme filme2 = new Filme("", "Quentin Tarantino", "154 min");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar filme: " + e.getMessage());
            }

            System.out.println();

            try {
                Filme filme3 = new Filme("Pulp Fiction", "", "154 min");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar filme: " + e.getMessage());
            }

            System.out.println();

            try {
                Filme filme4 = new Filme("The Matrix", "Wachowski", "");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar filme: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
