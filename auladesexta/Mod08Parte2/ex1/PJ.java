package ex1;
public class PJ extends Pessoa {
    private String CNPJ;
    private String IE;

    public PJ() {
        super();
        CNPJ = "";
        IE = "";
    }
    public PJ(String nome, String telefone, String endereco, String CNPJ, String IE) {
        super (nome, telefone, endereco);
        this.CNPJ = CNPJ;
        this.IE = IE;
    }

    @Override
    public void exibe() {
        System.out.println("CNPJ: " + this.CNPJ + ". IE: " + this.IE + ".");
    }
}

