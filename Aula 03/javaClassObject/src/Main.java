import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro bmwAzul = new Carro("i4", "BMW", 2020, "Azul");
        System.out.println(bmwAzul);

        Carro hondaCivic = new Carro();
        System.out.println(hondaCivic);
        hondaCivic.ano = 2020;
        hondaCivic.marca = "Honda";
        hondaCivic.modelo = "Civic LTS";
        System.out.println(hondaCivic);

    }
}