package exercicio08;

public class TesteProfessor {

    public static void main(String[] args) {
        try {
            Professor professor1 = new Professor("Maria Oliveira", "Matemática", 5000.00);
            System.out.println("Professor criado com sucesso:");
            System.out.println("Nome: " + professor1.getNome());
            System.out.println("Disciplina: " + professor1.getDisciplina());
            System.out.println("Salário: R$" + professor1.getSalario());
            professor1.darAula();
            professor1.corrigirProv();

            System.out.println();

            try {
                Professor professor2 = new Professor("", "Física", 4000.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar professor: " + e.getMessage());
            }

            System.out.println();

            try {
                Professor professor3 = new Professor("Carlos Silva", "", 4500.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar professor: " + e.getMessage());
            }

            System.out.println();

            try {
                Professor professor4 = new Professor("Ana Costa", "Química", -1000.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar professor: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
