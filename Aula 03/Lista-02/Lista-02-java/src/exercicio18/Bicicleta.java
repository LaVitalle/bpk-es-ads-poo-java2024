package exercicio18;

public class Bicicleta
{

    String marca, modelo;
    Integer tamanhoRoda;

    public Bicicleta(String marca, String modelo, Integer tamanhoRoda)
    {

        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;

    }

    public void pedala()
    {
        System.out.println("Pedalando!");
    }
    public void freia()
    {
        System.out.println("Freiando!");
    }

}
