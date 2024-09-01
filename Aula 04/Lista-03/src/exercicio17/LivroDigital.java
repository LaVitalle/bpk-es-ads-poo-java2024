package exercicio17;

public class LivroDigital {

    private String nome;
    private String autor;
    private int tamArq;

    public LivroDigital(String nome, String autor, int tamArq) {
        this.setNome(nome);
        this.setAutor(autor);
        this.setTamArq(tamArq);
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("O autor não pode ser nulo ou vazio.");
        }
        this.autor = autor;
    }

    public int getTamArq() {
        return tamArq;
    }

    public void setTamArq(int tamArq) {
        if (tamArq <= 0) {
            throw new IllegalArgumentException("O tamanho do arquivo deve ser maior que zero.");
        }
        this.tamArq = tamArq;
    }

    public void abrirLivro() {
        System.out.println("Livro " + nome + " foi aberto!!");
    }

    public void fecharLivro() {
        System.out.println("Livro " + nome + " foi fechado!!");
    }
}
