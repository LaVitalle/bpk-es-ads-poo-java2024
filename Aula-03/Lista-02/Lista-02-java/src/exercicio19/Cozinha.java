package exercicio19;

public class Cozinha
{

    String tipo;
    Integer qtdPessoas;
    String cor;

    public Cozinha(String tipo, Integer qtdPessoas, String cor)
    {
        this.tipo = tipo;
        this.qtdPessoas = qtdPessoas;
        this.cor = cor;
    }

    public void cozinhar()
    {
        System.out.println("Cozinhando!");
    }
    public void limpar()
    {
        System.out.println("Limpando!");
    }

}