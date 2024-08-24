public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + ano + ", " + cor.toLowerCase();
    }
}
