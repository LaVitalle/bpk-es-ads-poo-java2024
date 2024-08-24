package exercicio02;

/**
 * 2 - Defina uma classe Celular com atributos como marca, modelo,
 * e capacidadeBateria. Adicione métodos para ligar e desligar o celular.
 */
public class Celular {
    public String marca;
    public String modelo;
    public int capacidadeBateria;

    public Celular() {
    }

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria=" + capacidadeBateria +
                '}';
    }
}
