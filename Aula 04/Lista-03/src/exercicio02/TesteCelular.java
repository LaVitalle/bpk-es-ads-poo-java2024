package exercicio02;

public class TesteCelular {

    public static void main(String[] args) {
        try {
            Celular celular1 = new Celular("Samsung", "Galaxy A20", 4000);
            System.out.println("Celular criado com sucesso:");
            System.out.println("Marca: " + celular1.getMarca());
            System.out.println("Modelo: " + celular1.getModelo());
            System.out.println("Capacidade da Bateria: " + celular1.getCapBat() + "mAh");
            celular1.pOn();
            celular1.pOff();

            System.out.println();

            try {
                Celular celular2 = new Celular("", "iPhone 13", 3095);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar celular: " + e.getMessage());
            }

            System.out.println();

            try {
                Celular celular3 = new Celular("Apple", "", 3095);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar celular: " + e.getMessage());
            }

            System.out.println();

            try {
                Celular celular4 = new Celular("Xiaomi", "Mi 11", 0);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar celular: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
