package exercicio06;

public class Computador {

    private String processador;
    private String memRam;
    private String armazenamento;

    public Computador(String processador, String memRam, String armazenamento) {
        this.setProcessador(processador);
        this.setMemRam(memRam);
        this.setArmazenamento(armazenamento);
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        if (processador == null || processador.trim().isEmpty()) {
            throw new IllegalArgumentException("O processador não pode ser nulo ou vazio.");
        }
        this.processador = processador;
    }

    public String getMemRam() {
        return memRam;
    }

    public void setMemRam(String memRam) {
        if (memRam == null || memRam.trim().isEmpty()) {
            throw new IllegalArgumentException("A memória RAM não pode ser nula ou vazia.");
        }
        this.memRam = memRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        if (armazenamento == null || armazenamento.trim().isEmpty()) {
            throw new IllegalArgumentException("O armazenamento não pode ser nulo ou vazio.");
        }
        this.armazenamento = armazenamento;
    }

    public void powerOn() {
        System.out.println("Ligou!!\n");
    }

    public void powerOff() {
        System.out.println("Desligou!!\n");
    }
}
