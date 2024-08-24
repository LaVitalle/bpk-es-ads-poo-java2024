package exercicio09;

public class Produto
{
    String nome;
    Double preco;
    Integer qtdEstoque;

    public Produto(String nome, Double preco, Integer qtdEstoque)
    {

        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;

    }

    public void moreQtd()
    {
        qtdEstoque++;
        System.out.println(qtdEstoque);
    }
    public void lessQtd()
    {
        qtdEstoque--;
        System.out.println(qtdEstoque);
    }

}