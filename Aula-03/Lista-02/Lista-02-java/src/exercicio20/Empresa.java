package exercicio20;

public class Empresa
{

    String nome;
    String cnpj;
    Integer qtdFuncionarios;

    public Empresa(String nome, String cnpj, Integer qtdFuncionarios)
    {

        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdFuncionarios = qtdFuncionarios;

    }

    public void moreQtd()
    {
        qtdFuncionarios++;
        System.out.println(qtdFuncionarios);
    }
    public void lessQtd()
    {
        qtdFuncionarios--;
        System.out.println(qtdFuncionarios);
    }

}