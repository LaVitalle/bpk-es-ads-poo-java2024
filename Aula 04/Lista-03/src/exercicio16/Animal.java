package exercicio16;

public class Animal {

    private String especie;
    private Integer idade;
    private Double peso;

    public Animal(String especie, Integer idade, Double peso) {
        this.setEspecie(especie);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("A espécie não pode ser nula ou vazia.");
        }
        this.especie = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade == null || idade < 0) {
            throw new IllegalArgumentException("A idade deve ser um número não negativo.");
        }
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso == null || peso < 0) {
            throw new IllegalArgumentException("O peso deve ser um número não negativo.");
        }
        this.peso = peso;
    }

    public void comer() {
        System.out.println(especie + " Comeu!!");
    }

    public void dormir() {
        System.out.println(especie + " Dormiu!!");
    }
}
