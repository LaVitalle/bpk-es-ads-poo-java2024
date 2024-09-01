package exercicio13;

public class Time {

    private String nome;
    private String tecnico;
    private Integer numJoga;

    public Time(String nome, String tecnico, Integer numJoga) {
        this.setNome(nome);
        this.setTecnico(tecnico);
        this.setNumJoga(numJoga);
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

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        if (tecnico == null || tecnico.trim().isEmpty()) {
            throw new IllegalArgumentException("O técnico não pode ser nulo ou vazio.");
        }
        this.tecnico = tecnico;
    }

    public Integer getNumJoga() {
        return numJoga;
    }

    public void setNumJoga(Integer numJoga) {
        if (numJoga == null || numJoga < 0) {
            throw new IllegalArgumentException("O número de jogadores deve ser zero ou positivo.");
        }
        this.numJoga = numJoga;
    }

    public void moreNumJoga() {
        numJoga++;
        System.out.println("Número de jogadores após incremento: " + numJoga);
    }

    public void lessNumJoga() {
        if (numJoga > 0) {
            numJoga--;
            System.out.println("Número de jogadores após decremento: " + numJoga);
        } else {
            System.out.println("Não é possível diminuir o número de jogadores. Já está no mínimo.");
        }
    }
}
