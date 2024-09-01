package exercicio12;

public class Filme {

    private String titulo;
    private String diretor;
    private String duracao;

    public Filme(String titulo, String diretor, String duracao) {
        this.setTitulo(titulo);
        this.setDiretor(diretor);
        this.setDuracao(duracao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio.");
        }
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        if (diretor == null || diretor.trim().isEmpty()) {
            throw new IllegalArgumentException("O diretor não pode ser nulo ou vazio.");
        }
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        if (duracao == null || duracao.trim().isEmpty()) {
            throw new IllegalArgumentException("A duração não pode ser nula ou vazia.");
        }
        this.duracao = duracao;
    }

    public void start() {
        System.out.println("Começou!!");
    }

    public void stop() {
        System.out.println("Parou!!");
    }
}
