package exercicio11;

public class TesteCidade {

    public static void main(String[] args) {
        try {
            Cidade cidade1 = new Cidade("São Paulo", 12000000, "SP");
            System.out.println("Cidade criada com sucesso:");
            System.out.println("Nome: " + cidade1.getNome());
            System.out.println("População: " + cidade1.getPop());
            System.out.println("Estado: " + cidade1.getEstado());
            cidade1.morePop();
            cidade1.lessPop();
            cidade1.lessPop(); // Testando decremento

            System.out.println();

            try {
                Cidade cidade2 = new Cidade("", 500000, "RJ");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cidade: " + e.getMessage());
            }

            System.out.println();

            try {
                Cidade cidade3 = new Cidade("Belo Horizonte", -10000, "MG");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cidade: " + e.getMessage());
            }

            System.out.println();

            try {
                Cidade cidade4 = new Cidade("Curitiba", 1000000, "");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cidade: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
