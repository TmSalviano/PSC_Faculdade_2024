package ex2;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao; 

    public Vendedor(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss, double valorVendas, double comissao) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

   

    @Override
    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario(); 
        double valorComissao = valorVendas * comissao / 100; 
        return salarioEmpregado + valorComissao; 
    }

    @Override
    public String toString() {
        return "Vendedor {" +
            "Nome='" + this.nome + '\'' +
            ", Idade=" + this.idade +
            ", Altura=" + this.altura +
            ", Peso=" + this.peso +
            ", Número da Seção=" + this.numeroSecao +
            ", Salário Base=" + this.salarioBase +
            ", INSS=" + this.inss +
            ", Valor Vendas=" + this.valorVendas +
            ", Comissão=" + this.comissao + "%" +
            ", Salário Total=" + this.calcularSalario() +
            '}';
    }


    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

