package exercicio16;

public class Animal
{

    String especie;
    Integer idade;
    Double peso;

    public Animal(String especie, Integer idade, Double peso)
    {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void comer()
    {
        System.out.println(especie + " Comeu!!");
    }
    public void dormir()
    {
        System.out.println(especie + " Dormiu!!");
    }

}
