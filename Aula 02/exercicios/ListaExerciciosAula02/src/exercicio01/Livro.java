package exercicio01;

/**
 * 1 - Crie uma classe chamada Livro com atributos como titulo,
 * autor, e numeroDePaginas.
 * Adicione métodos para abrir o livro e ler uma página.
 */
public class Livro {
    public String titulo;
    public String autor;
    public Integer numeroDePaginas;
    private Integer paginaPercorrida = 0;
    private Boolean livroAberto = false;

    public Livro() {
    }

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void lerPagina(int pagina){
        this.paginaPercorrida = pagina;
    }


    public void abrirLivro(){
         this.livroAberto = true;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }
}
