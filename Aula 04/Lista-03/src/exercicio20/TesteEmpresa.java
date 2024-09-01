package exercicio20;

public class TesteEmpresa {

    public static void main(String[] args) {
        try {
            Empresa empresa1 = new Empresa("Tech Solutions", "12.345.678/0001-90", 50);
            System.out.println("Empresa criada com sucesso:");
            System.out.println("Nome: " + empresa1.getNome());
            System.out.println("CNPJ: " + empresa1.getCnpj());
            System.out.println("Quantidade de Funcionários: " + empresa1.getQtdFuncionarios());
            empresa1.moreQtd();
            empresa1.lessQtd();

            System.out.println();

            try {
                Empresa empresa2 = new Empresa("", "12.345.678/0001-90", 30);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar empresa: " + e.getMessage());
            }

            System.out.println();

            try {
                Empresa empresa3 = new Empresa("Empresa Exemplo", "", 20);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar empresa: " + e.getMessage());
            }

            System.out.println();

            try {
                Empresa empresa4 = new Empresa("Empresa Teste", "12.345.678/0001-90", -5);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar empresa: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
