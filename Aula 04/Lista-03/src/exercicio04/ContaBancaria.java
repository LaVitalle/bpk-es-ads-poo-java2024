package exercicio04;

public class ContaBancaria {

    private Integer numConta;
    private Double salConta;

    public ContaBancaria(Integer numConta, Double salConta) {
        this.setNumConta(numConta);
        this.setSalConta(salConta);
    }

    public Integer getNumConta() {
        return numConta;
    }

    public Double getSalConta() {
        return salConta;
    }

    public void setNumConta(Integer numConta) {
        if (numConta == null || numConta <= 0) {
            throw new IllegalArgumentException("O número da conta deve ser maior que zero.");
        }
        this.numConta = numConta;
    }

    public void setSalConta(Double salConta) {
        if (salConta == null || salConta < 0) {
            throw new IllegalArgumentException("O saldo da conta não pode ser negativo.");
        }
        this.salConta = salConta;
    }
}