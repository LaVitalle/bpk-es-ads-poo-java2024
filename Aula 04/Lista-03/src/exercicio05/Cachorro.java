package exercicio05;

public class Cachorro {

    private String nome;
    private String raca;
    private Integer idade;

    public Cachorro(String nome, String raca, Integer idade) {
        this.setNome(nome);
        this.setRaca(raca);
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.trim().isEmpty()) {
            throw new IllegalArgumentException("A raça não pode ser nula ou vazia.");
        }
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade == null || idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa ou nula.");
        }
        this.idade = idade;
    }

    public void latir() {
        System.out.println("Latiu");
    }

    public void correr() {
        System.out.println("Correu");
    }
}
