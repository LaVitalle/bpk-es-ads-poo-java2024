package exercicio06;

public class TesteComputador {

    public static void main(String[] args) {
        try {
            Computador computador1 = new Computador("Intel i7", "16GB", "1TB SSD");
            System.out.println("Computador criado com sucesso:");
            System.out.println("Processador: " + computador1.getProcessador());
            System.out.println("Memória RAM: " + computador1.getMemRam());
            System.out.println("Armazenamento: " + computador1.getArmazenamento());
            computador1.powerOn();
            computador1.powerOff();

            System.out.println();

            try {
                Computador computador2 = new Computador("", "8GB", "500GB HDD");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar computador: " + e.getMessage());
            }

            System.out.println();

            try {
                Computador computador3 = new Computador("AMD Ryzen 5", "", "256GB SSD");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar computador: " + e.getMessage());
            }

            System.out.println();

            try {
                Computador computador4 = new Computador("Intel i5", "8GB", "");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar computador: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
