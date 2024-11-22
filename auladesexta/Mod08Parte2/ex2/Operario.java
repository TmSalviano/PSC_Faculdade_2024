package ex2;
public class Operario extends Empregado {
    double valorProducao;
    double comissao;

    public Operario(
            String nome, int idade, double altura, double peso, 
            int numeroSecao, double salarioBase, double inss, double ajudaDeCusto,
            double valorProducao, double comissao
        ) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioOperario = salarioBase + this.comissao;

        return salarioOperario - (salarioOperario * inss / 100);
    }

    @Override
    public String toString() {
        return "Operario {" +
            "Nome='" + this.nome + '\'' +
            ", Idade=" + this.idade +
            ", Altura=" + this.altura +
            ", Peso=" + this.peso +
            ", Número da Seção=" + this.numeroSecao +
            ", Salário Base=" + this.salarioBase +
            ", INSS=" + this.inss +
            ", Valor Produção=" + this.valorProducao +
            ", Comissão=" + this.comissao +
            ", Salário Total=" + this.calcularSalario() +
            '}';
    }


    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
}
