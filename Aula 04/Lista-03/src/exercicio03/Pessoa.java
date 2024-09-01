package exercicio03;

public class Pessoa {

    private String nome;
    private int idade;
    private Double alt;

    public Pessoa(String nome, int idade, Double alt) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setAlt(alt);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Double getAlt() {
        return alt;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public void setAlt(Double alt) {
        if (alt == null || alt <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        this.alt = alt;
    }

    public void imprimePes() {
        System.out.println("Eu sou o " + nome + ", tenho " + idade + " anos e tenho " + alt + " de altura");
    }
}