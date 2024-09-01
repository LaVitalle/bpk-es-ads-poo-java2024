package exercicio08;

public class Professor {

    private String nome;
    private String disciplina;
    private Double salario;

    public Professor(String nome, String disciplina, Double salario) {
        this.setNome(nome);
        this.setDisciplina(disciplina);
        this.setSalario(salario);
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina == null || disciplina.trim().isEmpty()) {
            throw new IllegalArgumentException("A disciplina não pode ser nula ou vazia.");
        }
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if (salario == null || salario <= 0) {
            throw new IllegalArgumentException("O salário deve ser maior que zero.");
        }
        this.salario = salario;
    }

    public void darAula() {
        System.out.println("Deu aula!!");
    }

    public void corrigirProv() {
        System.out.println("Corrigiu prova!!");
    }
}
