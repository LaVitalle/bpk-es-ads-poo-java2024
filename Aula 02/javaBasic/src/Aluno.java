public class Aluno {
    private String nome;
    private String email;
    private int idade;

    public Aluno(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return """ 
                Nome:  %s
                Email: %s
                Idade: %s
              """.formatted(nome, email, idade);
    }
}
