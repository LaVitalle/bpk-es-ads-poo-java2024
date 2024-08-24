package exercicio10;

public class Veiculo
{

    String tipo;
    String placa;
    String cor;

    public Veiculo(String tipo, String placa, String cor)
    {

        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;

    }

    public void abastecer()
    {
        System.out.println("Abasteceu!!");
    }

    public void lavar()
    {
        System.out.println("Lavou!!");
    }
}