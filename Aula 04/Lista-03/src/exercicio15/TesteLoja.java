package exercicio15;

public class TesteLoja {

    public static void main(String[] args) {
        try {
            Loja loja1 = new Loja("Loja Central", "Rua das Flores, 123", "(11) 98765-4321");
            System.out.println("Loja criada com sucesso:");
            System.out.println("Nome: " + loja1.getNome());
            System.out.println("Endereço: " + loja1.getEndereco());
            System.out.println("Telefone: " + loja1.getTelefone());
            loja1.start();
            loja1.stop();

            System.out.println();

            try {
                Loja loja2 = new Loja("", "Rua das Acácias, 456", "(21) 12345-6789");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar loja: " + e.getMessage());
            }

            System.out.println();

            try {
                Loja loja3 = new Loja("Loja do Bairro", "", "(21) 12345-6789");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar loja: " + e.getMessage());
            }

            System.out.println();

            try {
                Loja loja4 = new Loja("Loja do Shopping", "Av. Paulista, 1000", "123456789");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar loja: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
