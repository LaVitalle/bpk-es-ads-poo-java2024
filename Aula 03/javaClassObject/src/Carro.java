public class Carro {

    public String modelo;
    public String marca;
    public int ano;
    public String cor;

    public Carro() {
    }

    public Carro(String modelo, String marca, int ano, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
}
