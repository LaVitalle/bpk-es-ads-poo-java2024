package exercicio05;

public class TesteCachorro {

    public static void main(String[] args) {
        try {
            Cachorro cachorro1 = new Cachorro("Rex", "Labrador", 5);
            System.out.println("Cachorro criado com sucesso:");
            System.out.println("Nome: " + cachorro1.getNome());
            System.out.println("Raça: " + cachorro1.getRaca());
            System.out.println("Idade: " + cachorro1.getIdade() + " anos");
            cachorro1.latir();
            cachorro1.correr();

            System.out.println();

            try {
                Cachorro cachorro2 = new Cachorro("", "Poodle", 3);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cachorro: " + e.getMessage());
            }

            System.out.println();

            try {
                Cachorro cachorro3 = new Cachorro("Ronaldo", "", 4);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cachorro: " + e.getMessage());
            }

            System.out.println();

            try {
                Cachorro cachorro4 = new Cachorro("Luna", "Beagle", -1);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar cachorro: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
