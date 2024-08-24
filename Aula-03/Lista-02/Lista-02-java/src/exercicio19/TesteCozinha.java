package exercicio19;

public class TesteCozinha {
    public static void main(String[] args) {

        Cozinha principal = new Cozinha("Comida caseira", 20, "Rosa");
        principal.cozinhar();
        principal.limpar();

    }
}