package exercicio14;

public class TesteJogo {

    public static void main(String[] args) {
        try {
            Jogo jogo1 = new Jogo("The Last of Us", "Ação", 249.90);
            System.out.println("Jogo criado com sucesso:");
            System.out.println("Nome: " + jogo1.getNome());
            System.out.println("Gênero: " + jogo1.getGenero());
            System.out.println("Preço: R$" + jogo1.getPreco());
            jogo1.start();
            jogo1.stop();

            System.out.println();

            try {
                Jogo jogo2 = new Jogo("", "Ação", 59.90);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar jogo: " + e.getMessage());
            }

            System.out.println();

            try {
                Jogo jogo3 = new Jogo("Minecraft", "", 79.90);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar jogo: " + e.getMessage());
            }

            System.out.println();

            try {
                Jogo jogo4 = new Jogo("Among Us", "Discórdia", -10.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar jogo: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
