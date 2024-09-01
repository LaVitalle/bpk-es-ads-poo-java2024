package exercicio10;

public class TesteVeiculo {

    public static void main(String[] args) {
        try {
            Veiculo veiculo1 = new Veiculo("Carro", "ABC-1234", "Preto");
            System.out.println("Veículo criado com sucesso:");
            System.out.println("Tipo: " + veiculo1.getTipo());
            System.out.println("Placa: " + veiculo1.getPlaca());
            System.out.println("Cor: " + veiculo1.getCor());
            veiculo1.abastecer();
            veiculo1.lavar();

            System.out.println();

            try {
                Veiculo veiculo2 = new Veiculo("", "XYZ-5678", "Azul");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar veículo: " + e.getMessage());
            }

            System.out.println();

            try {
                Veiculo veiculo3 = new Veiculo("Moto", "", "Vermelho");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar veículo: " + e.getMessage());
            }

            System.out.println();

            try {
                Veiculo veiculo4 = new Veiculo("Caminhão", "LMN-1234", "");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar veículo: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
