package exercicio03;

/**
 * 3 - Implemente uma classe Pessoa com atributos nome, idade, e altura.
 * Adicione um método que imprime uma apresentação da pessoa.
 */
public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
