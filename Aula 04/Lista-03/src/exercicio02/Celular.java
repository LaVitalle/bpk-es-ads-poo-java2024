package exercicio02;

public class Celular {

    private String marca;
    private String modelo;
    private int capBat;

    public Celular(String marca, String modelo, int capBat) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCapBat(capBat);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapBat() {
        return capBat;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca não pode ser nula ou vazia.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser nulo ou vazio.");
        }
        this.modelo = modelo;
    }

    public void setCapBat(int capBat) {
        if (capBat <= 0) {
            throw new IllegalArgumentException("A capacidade da bateria deve ser maior que zero.");
        }
        this.capBat = capBat;
    }

    public void pOn() {
        System.out.println("\nLigando " + modelo);
    }

    public void pOff() {
        System.out.println("\nDesligando " + modelo);
    }
}