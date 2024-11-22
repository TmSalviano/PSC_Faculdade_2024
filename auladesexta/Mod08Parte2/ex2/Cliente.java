package ex2;

public class Cliente extends Pessoa{
    double credMax;
    double valorEmDivida;

    public Cliente(String name, int idade, double altura, double peso, double credMax, double valorEmDivida) {
        super(name, idade, altura, peso);
        this.credMax = credMax;
        this.valorEmDivida = valorEmDivida;
    }


    public double obterSaldo() {
        return credMax - valorEmDivida;
    }

    public double getCredMax() {
        return credMax;
    }

    public void setCredMax(double credMax) {
        this.credMax = credMax;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    @Override
public String toString() {
    return "Cliente {" +
           "Nome='" + nome + '\'' +
           ", Idade=" + idade +
           ", Altura=" + altura +
           ", Peso=" + peso +
           ", Crédito Máximo=" + credMax +
           ", Valor em Dívida=" + valorEmDivida +
           ", Saldo Disponível=" + obterSaldo() +
           '}';
}

    
}
