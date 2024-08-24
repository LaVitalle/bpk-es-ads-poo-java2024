import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro bmwAzul = new Carro("BMW", "i4 ", 2020, "Azul Metálica");
        Carro hondaCivic = new Carro("Honda", "Civic LTS", 2008, "Prata");
        Carro carro = new Carro();
        Carro hondaCivicPreto = new Carro("Honda", "Civic LTS", "Preto");

        LojaCarros lojaCarros = new LojaCarros();

        lojaCarros.adquirirCarroNaLoja(bmwAzul);
        lojaCarros.adquirirCarroNaLoja(hondaCivic);

        System.out.println("CARROS DISPONÍVEIS");
        System.out.println("--------------------------------");
        for (Carro carroDisponivel : lojaCarros.getCarrosDisponiveis()) {
            System.out.println(carroDisponivel);
        }

        lojaCarros.venderCarro(bmwAzul);

        System.out.println("CARROS DISPONÍVEIS");
        System.out.println("--------------------------------");
        for (Carro carroDisponivel : lojaCarros.getCarrosDisponiveis()) {
            System.out.println(carroDisponivel);
        }

        lojaCarros.getCarrosVendidos();


//        System.out.println(listaCarros.get(0));






    }
}