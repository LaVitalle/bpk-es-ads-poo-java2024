import java.util.ArrayList;
import java.util.List;

public class Garagem {

    public List<Carro> carrosDisponiveis = new ArrayList<>();
    public List<Carro> carrosVendidos = new ArrayList<>();

    public void cadastrarNovoCarro(Carro carro){
        carrosDisponiveis.add(carro);
    }

    public void darBaixa(Carro carro){
        carrosDisponiveis.remove(carro);
    }

    public List<Carro> getCarrosDisponiveis(){
        return this.carrosDisponiveis;
    }





}
