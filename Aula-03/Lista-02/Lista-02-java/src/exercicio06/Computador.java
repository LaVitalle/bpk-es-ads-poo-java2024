package exercicio06;

public class Computador
{

    String processador;
    String memRam;
    String armazenamento;

    public Computador(String processador, String memRam, String armazenamento)
    {

        this.processador = processador;
        this. memRam = memRam;
        this.armazenamento = armazenamento;

    }

    public void powerOn()
    {
        System.out.println("Ligou!!\n");
    }

    public void powerOff()
    {
        System.out.println("Desligou!!\n");
    }
}