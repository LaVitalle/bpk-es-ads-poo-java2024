package exercicio19;

public class Cozinha {

    private String tipo;
    private Integer qtdPessoas;
    private String cor;

    public Cozinha(String tipo, Integer qtdPessoas, String cor) {
        this.setTipo(tipo);
        this.setQtdPessoas(qtdPessoas);
        this.setCor(cor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("O tipo não pode ser nulo ou vazio.");
        }
        this.tipo = tipo;
    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas) {
        if (qtdPessoas == null || qtdPessoas < 0) {
            throw new IllegalArgumentException("A quantidade de pessoas deve ser um número não negativo.");
        }
        this.qtdPessoas = qtdPessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            throw new IllegalArgumentException("A cor não pode ser nula ou vazia.");
        }
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("Cozinhando!");
    }

    public void limpar() {
        System.out.println("Limpando!");
    }
}
