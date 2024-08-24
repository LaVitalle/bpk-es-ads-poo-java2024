package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class SistemaBancario {

    List<ContaBancaria> contas = new ArrayList<>();


    public void abrirConta(ContaBancaria conta){
        contas.add(conta);
    }

    public void fecharConta(ContaBancaria conta){
        contas.remove(conta);
    }
}
