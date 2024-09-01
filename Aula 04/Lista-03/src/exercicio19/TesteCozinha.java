package exercicio19;

public class TesteCozinha {

    public static void main(String[] args) {
        try {
            Cozinha cozinha1 = new Cozinha("Gourmet", 4, "Branco");
            System.out.println("Cozinha criada com sucesso:");
            System.out.println("Tipo: " + cozinha1.getTipo());
            System.out.println("Quantidade de Pessoas: " + cozinha1.getQtdPessoas());
            System.out.println("Cor: " + cozinha1.getCor());
            cozinha1.cozinhar();
            cozinha1.limpar();

            System.out.println();

            try {
                Cozinha cozinha2 = new Cozinha("", 4, "Azul");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cozinha: " + e.getMessage());
            }

            System.out.println();

            try {
                Cozinha cozinha3 = new Cozinha("Moderna", -1, "Verde");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cozinha: " + e.getMessage());
            }

            System.out.println();

            try {
                Cozinha cozinha4 = new Cozinha("Clássica", 5, "");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cozinha: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
