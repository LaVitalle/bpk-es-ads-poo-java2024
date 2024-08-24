package exercicio15;

public class Loja
{

    String nome, endereco, telefone;

    public Loja(String nome, String endereco, String telefone)
    {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;

    }

    public void start()
    {
        System.out.println("Abriu!!");
    }
    public void stop()
    {
        System.out.println("Fechou!!");
    }

}
