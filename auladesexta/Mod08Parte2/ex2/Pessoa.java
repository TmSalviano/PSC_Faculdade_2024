package ex2;

public class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
            "Nome='" + this.nome + '\'' +
            ", Idade=" + this.idade +
            ", Altura=" + this.altura +
            ", Peso=" + this.peso +
            '}';
    }


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
