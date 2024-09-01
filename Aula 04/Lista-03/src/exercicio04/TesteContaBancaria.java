package exercicio04;

public class TesteContaBancaria {

    public static void main(String[] args) {
        try {
            ContaBancaria conta1 = new ContaBancaria(12345, 1500.00);
            System.out.println("Conta criada com sucesso:");
            System.out.println("Número da Conta: " + conta1.getNumConta());
            System.out.println("Saldo da Conta: R$" + conta1.getSalConta());

            System.out.println();

            try {
                ContaBancaria conta2 = new ContaBancaria(-1, 2000.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar conta: " + e.getMessage());
            }

            System.out.println();

            try {
                ContaBancaria conta3 = new ContaBancaria(54321, -100.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar conta: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
