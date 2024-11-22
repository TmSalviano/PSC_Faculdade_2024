package ex2;
public class Administrador extends Empregado {
    double ajudaDeCusto;

    public Administrador(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss, double ajudaDeCusto ) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
        this.ajudaDeCusto = ajudaDeCusto;
    }


    @Override
    public double calcularSalario() {
        return (salarioBase - (salarioBase * inss / 100)) + ajudaDeCusto;
    }


    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }


    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    } 

    @Override
public String toString() {
    return "Administrador {" +
           "Nome='" + nome + '\'' +
           ", Idade=" + idade +
           ", Altura=" + altura +
           ", Peso=" + peso +
           ", Número da Seção=" + numeroSecao +
           ", Salário Base=" + salarioBase +
           ", INSS=" + inss +
           ", Ajuda de Custo=" + ajudaDeCusto +
           ", Salário Total=" + calcularSalario() +
           '}';
}
}
