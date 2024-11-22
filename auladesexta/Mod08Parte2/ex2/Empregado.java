package ex2;

public class Empregado extends Pessoa{
    int numeroSecao;
    protected double salarioBase;
    protected double inss;

    public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss ) {
        super(nome, idade, altura, peso);

        this.numeroSecao = numeroSecao;
        this.salarioBase = salarioBase;
        this.inss = inss;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * inss / 100);
    }

    @Override
public String toString() {
    return "Empregado {" +
           "Nome='" + nome + '\'' +
           ", Idade=" + idade +
           ", Altura=" + altura +
           ", Peso=" + peso +
           ", Número da Seção=" + numeroSecao +
           ", Salário Base=" + salarioBase +
           ", INSS=" + inss +
           ", Salário Líquido=" + calcularSalario() +
           '}';
}


    public int getNumeroSecao() {
        return numeroSecao;
    }

    public void setNumeroSecao(int numeroSecao) {
        this.numeroSecao = numeroSecao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }


}
