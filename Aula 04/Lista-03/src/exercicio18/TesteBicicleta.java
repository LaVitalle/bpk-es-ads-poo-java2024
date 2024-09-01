package exercicio18;

public class TesteBicicleta {

    public static void main(String[] args) {
        try {
            Bicicleta bike1 = new Bicicleta("Caloi", "Explorer", 26);
            System.out.println("Bicicleta criada com sucesso:");
            System.out.println("Marca: " + bike1.getMarca());
            System.out.println("Modelo: " + bike1.getModelo());
            System.out.println("Tamanho da Roda: " + bike1.getTamanhoRoda() + " polegadas");
            bike1.pedala();
            bike1.freia();

            System.out.println();

            try {
                Bicicleta bike2 = new Bicicleta("", "Modelo A", 24);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar bicicleta: " + e.getMessage());
            }

            System.out.println();

            try {
                Bicicleta bike3 = new Bicicleta("Marca B", "", 24);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar bicicleta: " + e.getMessage());
            }

            System.out.println();

            try {
                Bicicleta bike4 = new Bicicleta("Marca C", "Modelo C", -15);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar bicicleta: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
