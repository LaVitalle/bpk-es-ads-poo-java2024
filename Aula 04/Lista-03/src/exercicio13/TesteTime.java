package exercicio13;

public class TesteTime {

    public static void main(String[] args) {
        try {
            Time time1 = new Time("Atlético", "João Silva", 11);
            System.out.println("Time criado com sucesso:");
            System.out.println("Nome: " + time1.getNome());
            System.out.println("Técnico: " + time1.getTecnico());
            System.out.println("Número de Jogadores: " + time1.getNumJoga());
            time1.moreNumJoga();
            time1.lessNumJoga();
            time1.lessNumJoga(); // Testando decremento

            System.out.println();

            try {
                Time time2 = new Time("", "Carlos Souza", 15);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar time: " + e.getMessage());
            }

            System.out.println();

            try {
                Time time3 = new Time("Flamengo", "", 20);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar time: " + e.getMessage());
            }

            System.out.println();

            try {
                Time time4 = new Time("Vasco", "Fernanda Lima", -5);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar time: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
