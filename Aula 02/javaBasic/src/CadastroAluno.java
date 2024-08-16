public class CadastroAluno {
    public static void main(String[] args) {
        IO io = new IO();

        String nome = io.input("Digite seu nome");
        String email = io.input("Email: ");
        int idade = io.inputInt("Idade: ");

        Aluno aluno = new Aluno(nome, email, idade);

        System.out.println(aluno);


    }
}
