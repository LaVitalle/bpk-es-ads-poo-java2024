public class Carro {
    public String modelo;
    public String marca;
    public String cor;
    public int ano;

//    public Carro() {
//    }

    public Carro(String modelo, String marca, String cor, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return """
                """;
//        return marca + " " + modelo + " " + cor + " " + ano;
    }
}