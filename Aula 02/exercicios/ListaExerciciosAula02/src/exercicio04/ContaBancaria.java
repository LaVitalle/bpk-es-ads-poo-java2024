package exercicio04;

/**
 * 4 - Crie uma classe ContaBancaria com atributos como numeroConta e saldo.
 * Adicione métodos para depositar e sacar dinheiro.
 */
public class ContaBancaria {

    private Cliente cliente;
    private Integer numeroConta;
    private Double saldo;


    public ContaBancaria(Integer numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void sacar(Double valor){
        this.saldo = saldo - valor;
    }

    public void depositar(Double valor){
        this.saldo = saldo + valor;
    }

    @Override
    public String toString() {
        return "Conta: " + numeroConta + "\n" +
                "Saldo: " + saldo;
    }
}
