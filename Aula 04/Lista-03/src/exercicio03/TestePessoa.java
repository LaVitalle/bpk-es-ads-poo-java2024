package exercicio03;

public class TestePessoa {

    public static void main(String[] args) {
        try {
            Pessoa pessoa1 = new Pessoa("João", 25, 1.75);
            pessoa1.imprimePes();

            System.out.println();

            try {
                Pessoa pessoa2 = new Pessoa("", 30, 1.80);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar pessoa: " + e.getMessage());
            }

            System.out.println();

            try {
                Pessoa pessoa3 = new Pessoa("Maria", -5, 1.65);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar pessoa: " + e.getMessage());
            }

            System.out.println();

            try {
                Pessoa pessoa4 = new Pessoa("Ana", 22, 0.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar pessoa: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}