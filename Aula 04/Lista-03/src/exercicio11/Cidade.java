package exercicio11;

public class Cidade {

    private String nome;
    private Integer pop;
    private String estado;

    public Cidade(String nome, Integer pop, String estado) {
        this.setNome(nome);
        this.setPop(pop);
        this.setEstado(estado);
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

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        if (pop == null || pop < 0) {
            throw new IllegalArgumentException("A população deve ser zero ou positiva.");
        }
        this.pop = pop;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            throw new IllegalArgumentException("O estado não pode ser nulo ou vazio.");
        }
        this.estado = estado;
    }

    public void morePop() {
        pop++;
        System.out.println("População após incremento: " + pop);
    }

    public void lessPop() {
        if (pop > 0) {
            pop--;
            System.out.println("População após decremento: " + pop);
        } else {
            System.out.println("Não é possível diminuir a população. Já está no mínimo.");
        }
    }
}
