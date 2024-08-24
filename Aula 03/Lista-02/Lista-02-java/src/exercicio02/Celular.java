package exercicio02;

public class Celular
{
    
    String marca;
    String modelo;
    int capBat;

    public Celular(String marca, String modelo, int capBat)
    {

        this.marca = marca;
        this.modelo = modelo;
        this.capBat = capBat;

    }

    public void pOn()
    {
        System.out.println("\nLigando " + modelo);
    }
    public void pOff()
    {
        System.out.println("\nDesligando " + modelo);
    }
}