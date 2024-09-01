package exercicio10;

public class Veiculo {

    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.setTipo(tipo);
        this.setPlaca(placa);
        this.setCor(cor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("O tipo não pode ser nulo ou vazio.");
        }
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            throw new IllegalArgumentException("A cor não pode ser nula ou vazia.");
        }
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("Abasteceu!!");
    }

    public void lavar() {
        System.out.println("Lavou!!");
    }
}
