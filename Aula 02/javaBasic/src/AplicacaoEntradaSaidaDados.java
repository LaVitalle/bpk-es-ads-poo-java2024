import java.util.Scanner;


public class AplicacaoEntradaSaidaDados {
    /**
     * O método main é o ponto de entrada do programa.
     * É o método que é executado quando o programa é iniciado.
     * String[] args permite que argumentos sejam passados para o programa a partir
     * da linha de comando.
     * @param args
     */
    public static void main(String[] args) {

        IO io = new IO();

        String nome = io.input("Digite o seu nome: ");
        int idade = io.inputInt("Digite sua idade: ");

        /**
         * A variável userInfo é uma string formatada, usando uma sintaxe de bloco de texto (text block) do Java,
         * introduzida a partir do Java 13.
         * O método formatted() substitui os placeholders %s pelos valores das variáveis nome e idade.
         * System.out.println(userInfo); exibe a string formatada no console, mostrando o nome e a idade do usuário.
         */
        String userInfo = """
                 Nome: %s
                 Idade: %s
                """.formatted(nome, idade);
        System.out.println(userInfo);


    }




}