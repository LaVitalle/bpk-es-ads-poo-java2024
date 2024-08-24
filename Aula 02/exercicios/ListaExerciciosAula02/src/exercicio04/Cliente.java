package exercicio04;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getDadosCliente(){
        return "Nome: " + nome + " \n" +
                "CPF: " + cpf + " \n" +
                "Email: " + email + "\n";
    }
}
