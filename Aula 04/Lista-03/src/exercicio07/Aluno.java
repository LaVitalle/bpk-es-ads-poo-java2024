package exercicio07;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private int N1;
    private int N2;
    private int N3;

    public Aluno(String nome, String matricula, String curso, Integer N1, Integer N2, Integer N3) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setCurso(curso);
        this.setN1(N1);
        this.setN2(N2);
        this.setN3(N3);
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("A matrícula não pode ser nula ou vazia.");
        }
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.trim().isEmpty()) {
            throw new IllegalArgumentException("O curso não pode ser nulo ou vazio.");
        }
        this.curso = curso;
    }

    public int getN1() {
        return N1;
    }

    public void setN1(int N1) {
        if (N1 < 0 || N1 > 10) {
            throw new IllegalArgumentException("A nota N1 deve estar entre 0 e 10.");
        }
        this.N1 = N1;
    }

    public int getN2() {
        return N2;
    }

    public void setN2(int N2) {
        if (N2 < 0 || N2 > 10) {
            throw new IllegalArgumentException("A nota N2 deve estar entre 0 e 10.");
        }
        this.N2 = N2;
    }

    public int getN3() {
        return N3;
    }

    public void setN3(int N3) {
        if (N3 < 0 || N3 > 10) {
            throw new IllegalArgumentException("A nota N3 deve estar entre 0 e 10.");
        }
        this.N3 = N3;
    }

    public void mediaAluno() {
        System.out.println("Média: " + ((N1 + N2 + N3) / 3.0));
    }
}
