package exercicio20;

public class Empresa {

    private String nome;
    private String cnpj;
    private Integer qtdFuncionarios;

    public Empresa(String nome, String cnpj, Integer qtdFuncionarios) {
        this.setNome(nome);
        this.setCnpj(cnpj);
        this.setQtdFuncionarios(qtdFuncionarios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj == null || cnpj.trim().isEmpty()) {
            throw new IllegalArgumentException("O CNPJ não pode ser nulo ou vazio.");
        }
        this.cnpj = cnpj;
    }

    public Integer getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(Integer qtdFuncionarios) {
        if (qtdFuncionarios == null || qtdFuncionarios < 0) {
            throw new IllegalArgumentException("A quantidade de funcionários deve ser um número não negativo.");
        }
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public void moreQtd() {
        qtdFuncionarios++;
        System.out.println(qtdFuncionarios);
    }

    public void lessQtd() {
        qtdFuncionarios--;
        System.out.println(qtdFuncionarios);
    }
}
