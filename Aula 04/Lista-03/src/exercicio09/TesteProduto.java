package exercicio09;

public class TesteProduto {

    public static void main(String[] args) {
        try {
            Produto produto1 = new Produto("Teclado", 120.50, 10);
            System.out.println("Produto criado com sucesso:");
            System.out.println("Nome: " + produto1.getNome());
            System.out.println("Preço: R$" + produto1.getPreco());
            System.out.println("Quantidade em Estoque: " + produto1.getQtdEstoque());
            produto1.moreQtd();
            produto1.lessQtd();
            produto1.lessQtd(); // Testando decremento

            System.out.println();

            try {
                Produto produto2 = new Produto("", 50.00, 5);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar produto: " + e.getMessage());
            }

            System.out.println();

            try {
                Produto produto3 = new Produto("Mouse", -10.00, 7);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar produto: " + e.getMessage());
            }

            System.out.println();

            try {
                Produto produto4 = new Produto("Monitor", 800.00, -3);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar produto: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
