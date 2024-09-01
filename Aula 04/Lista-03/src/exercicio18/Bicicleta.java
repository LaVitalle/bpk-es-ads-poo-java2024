package exercicio18;

public class Bicicleta {

    private String marca;
    private String modelo;
    private Integer tamanhoRoda;

    public Bicicleta(String marca, String modelo, Integer tamanhoRoda) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTamanhoRoda(tamanhoRoda);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca não pode ser nula ou vazia.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser nulo ou vazio.");
        }
        this.modelo = modelo;
    }

    public Integer getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(Integer tamanhoRoda) {
        if (tamanhoRoda == null || tamanhoRoda <= 0) {
            throw new IllegalArgumentException("O tamanho da roda deve ser um número positivo.");
        }
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedala() {
        System.out.println("Pedalando!");
    }

    public void freia() {
        System.out.println("Freiando!");
    }
}
