import java.util.ArrayList;
import java.util.List;

public class LojaCarros {

    public String nome;
    public String endereco;
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    private List<Carro> carrosVendidos = new ArrayList<>();

    public void adquirirCarroNaLoja(Carro carro){
        carrosDisponiveis.add(carro);
    }

    public void venderCarro(Carro carro){
        carrosDisponiveis.remove(carro);
        carrosVendidos.add(carro);
    }


    public List<Carro> getCarrosVendidos() {
        return carrosVendidos;
    }

    public List<Carro> getCarrosDisponiveis() {
        return carrosDisponiveis;
    }
}
