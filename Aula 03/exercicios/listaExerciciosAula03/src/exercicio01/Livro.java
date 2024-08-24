package exercicio01;

import java.util.Objects;

/**
 * 1 - Crie uma classe chamada Livro com atributos como titulo,
 * autor, e numeroDePaginas.
 * Adicione métodos para abrir o livro e ler uma página.
 */
public class Livro {
    public String titulo;
    public String autor;
    public Integer numeroDePaginas;
    private Boolean aberto = false;
    private Integer paginaAtual = 1;
    private Boolean concluido = false;

    public Livro(String titulo, String autor, Integer numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void abrirLivro(){
        this.aberto = true;
    }

    public void lerPagina(){

        if(paginaAtual.equals(numeroDePaginas)){
            concluido = true;
        }else{
            paginaAtual++;
        }
    }

    public Boolean livroAberto() {
        return aberto;
    }

    public Integer getPaginaAtual() {
        return paginaAtual;
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
