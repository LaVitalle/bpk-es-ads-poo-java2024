package exercicio09;

public class TesteProduto
{
    public static void main(String[] args)
    {

        Produto produto01 = new Produto("Uva", 3.50, 500);
        produto01.moreQtd();
        produto01.moreQtd();
        produto01.lessQtd();

    }
}