import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro bmwAzul = new Carro("i4", "BMW",  "Azul", 2020);
        System.out.println(bmwAzul);

        Carro hondaCivic = new Carro("Civic LTS", "Honda", "Prata", 2008);
        System.out.println(hondaCivic);


        Garagem garagem = new Garagem();
        garagem.cadastrarNovoCarro(bmwAzul);
        garagem.cadastrarNovoCarro(hondaCivic);

        System.out.println("Lista de carros disponíveis: " + garagem.getCarrosDisponiveis().size());
        System.out.println(garagem.getCarrosDisponiveis());
        garagem.getCarrosDisponiveis().forEach(carro -> {
            System.out.println(carro);
        });

        garagem.darBaixa(hondaCivic);

        System.out.println("Lista de carros disponíveis: " + garagem.getCarrosDisponiveis().size());
        garagem.getCarrosDisponiveis().forEach(carro -> {
            System.out.println(carro);
        });



//        hondaCivic.ano = 2020;
//        hondaCivic.marca = "Honda";
//        hondaCivic.modelo = "Civic LTS";
//        hondaCivic.cor = "Prata";
//        System.out.println(hondaCivic);

    }
}