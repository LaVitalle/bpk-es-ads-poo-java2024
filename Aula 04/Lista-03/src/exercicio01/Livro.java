package exercicio01;

public class Livro {

    private String nome;
    private String autor;
    private int pag;

    public Livro(String nome, String autor, int pag) {
        this.setNome(nome);
        this.setAutor(autor);
        this.setPag(pag);
    }

    public String getNome() {
        return this.nome;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getPag() {
        return this.pag;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do livro não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do autor não pode ser nulo ou vazio.");
        }
        this.autor = autor;
    }

    public void setPag(int pag) {
        if (pag <= 0) {
            throw new IllegalArgumentException("O número de páginas deve ser maior que zero.");
        }
        this.pag = pag;
    }

    public void abrirLivro() {
        System.out.println("exercicio01.Livro " + nome + " foi aberto!!");
    }

    public void lerPaginas() {
        for (int i = 1; i <= this.pag; i++) {
            System.out.println("Leu a página: " + i);
        }
    }
}