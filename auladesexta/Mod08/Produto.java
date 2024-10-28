package auladesexta.Mod08;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int ultimo_Id = 0;

    public Produto() {
        this.id = ++ultimo_Id;
        this.nome = "Nome não informado";
        this.preco = 0;
    }
    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        setPreco(preco);
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public static int getUltimoId() {
        return ultimo_Id;
    }
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    public void reajustaPreco(double percentual) {
        if (percentual > 0) {
            this.preco += this.preco * (percentual / 100);
        }
    }
}
