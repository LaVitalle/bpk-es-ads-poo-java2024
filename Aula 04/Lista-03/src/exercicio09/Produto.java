package exercicio09;

public class Produto {

    private String nome;
    private Double preco;
    private Integer qtdEstoque;

    public Produto(String nome, Double preco, Integer qtdEstoque) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQtdEstoque(qtdEstoque);
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco == null || preco < 0) {
            throw new IllegalArgumentException("O preço deve ser maior ou igual a zero.");
        }
        this.preco = preco;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        if (qtdEstoque == null || qtdEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque deve ser zero ou positiva.");
        }
        this.qtdEstoque = qtdEstoque;
    }

    public void moreQtd() {
        qtdEstoque++;
        System.out.println("Quantidade em estoque após incremento: " + qtdEstoque);
    }

    public void lessQtd() {
        if (qtdEstoque > 0) {
            qtdEstoque--;
            System.out.println("Quantidade em estoque após decremento: " + qtdEstoque);
        } else {
            System.out.println("Não é possível diminuir a quantidade. Estoque já está vazio.");
        }
    }
}
