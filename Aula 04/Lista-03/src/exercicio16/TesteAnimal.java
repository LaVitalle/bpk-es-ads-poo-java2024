package exercicio16;

public class TesteAnimal {

    public static void main(String[] args) {
        try {
            Animal animal1 = new Animal("Leão", 5, 180.5);
            System.out.println("Animal criado com sucesso:");
            System.out.println("Espécie: " + animal1.getEspecie());
            System.out.println("Idade: " + animal1.getIdade());
            System.out.println("Peso: " + animal1.getPeso());
            animal1.comer();
            animal1.dormir();

            System.out.println();

            try {
                Animal animal2 = new Animal("", 4, 70.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar animal: " + e.getMessage());
            }

            System.out.println();

            try {
                Animal animal3 = new Animal("Elefante", -1, 600.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar animal: " + e.getMessage());
            }

            System.out.println();

            try {
                Animal animal4 = new Animal("Tigre", 3, -50.0);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar animal: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
