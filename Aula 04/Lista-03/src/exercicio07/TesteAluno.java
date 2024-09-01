package exercicio07;

public class TesteAluno {

    public static void main(String[] args) {
        try {
            Aluno aluno1 = new Aluno("Carlos Silva", "12345", "Engenharia", 7, 8, 9);
            System.out.println("Aluno criado com sucesso:");
            System.out.println("Nome: " + aluno1.getNome());
            System.out.println("Matrícula: " + aluno1.getMatricula());
            System.out.println("Curso: " + aluno1.getCurso());
            aluno1.mediaAluno();

            System.out.println();

            try {
                Aluno aluno2 = new Aluno("", "67890", "Matemática", 5, 6, 11);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar aluno: " + e.getMessage());
            }

            System.out.println();

            try {
                Aluno aluno3 = new Aluno("Ana Souza", "23456", "", 7, -1, 8);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar aluno: " + e.getMessage());
            }

            System.out.println();

            try {
                Aluno aluno4 = new Aluno("Lucas Pereira", "34567", "Física", 12, 8, 9);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar aluno: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
