package auladesexta.Mod08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var keyboard = new Scanner(System.in)) {

            //Teste Circulo
            System.err.println("Insira o valor da coordenada x:");
            int coordenadaX = keyboard.nextInt();
            System.err.println("Insira o valor da coordenada y:");
            int coordenadaY = keyboard.nextInt();
            System.err.println("Insira o valor do raio do circulo:");
            double raio = keyboard.nextDouble();
    
            var circulo = new Circulo(coordenadaX, coordenadaY, raio);

            int answer = Integer.MAX_VALUE;
            while (answer != 4) {
                System.err.println("1 - Mover");
                System.err.println("2 - Aumentar");
                System.err.println("3 - Imprimir");
                System.err.println("4 - Sair");
                
                keyboard.nextLine(); //remove buffer
                answer = keyboard.nextInt();

                //Eu poderia facilmente fazer o usuario inserir o quanto que ele quer mover o circulo e etc.
                //Porem o exercicio nao pediu isso e eu tenho muita coisa pra fazer kkkkkkkkkk. E nois Mark!
                switch (answer) {
                    case 1 -> {
                        circulo.moveX(answer);
                        circulo.moveY(answer);
                    }
                    case 2 -> circulo.aumentarRaio(answer);
                    case 3 -> circulo.exibe();
                    case 4 -> {
                        return;
                    }
                    default -> throw new AssertionError();
                }

                //Teste Produto
                System.out.println("Informe o nome do primeiro produto:");
                String nome1 = keyboard.nextLine();
                System.out.println("Informe o preço do primeiro produto:");
                double preco1 = keyboard.nextDouble();
                Produto produto1 = new Produto(nome1, preco1);

                keyboard.nextLine(); 
                System.out.println("Informe o nome do segundo produto:");
                String nome2 = keyboard.nextLine();
                System.out.println("Informe o preço do segundo produto:");
                double preco2 = keyboard.nextDouble();
                Produto produto2 = new Produto(nome2, preco2);

                System.out.println("Informe o percentual de reajuste de preço:");
                double reajuste = keyboard.nextDouble();
                produto1.reajustaPreco(reajuste);
                produto2.reajustaPreco(reajuste);

                System.out.println("\nInformações dos produtos:");
                produto1.exibe();
                produto2.exibe();

                System.out.println("\nÚltimo ID gerado: " + Produto.getUltimoId());

                //Teste Inteiro
                //Resolvir fazer o loop de um jeito diferente porque esses exercicios sao entediantes.
                Inteiro inteiro = new Inteiro();
                int opcao;
                do {
                    System.out.println("\nEscolha uma opção:");
                    System.out.println("1 – Multiplicação");
                    System.out.println("2 – Potência");
                    System.out.println("3 – Divisão");
                    System.out.println("4 – Par");
                    System.out.println("5 – Sair");

                    opcao = keyboard.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.print("Digite dois números para multiplicação: ");
                            int m1 = keyboard.nextInt();
                            int m2 = keyboard.nextInt();
                            System.out.println("Resultado: " + inteiro.multiplicacao(m1, m2));
                            break;
                        case 2:
                            System.out.print("Digite a base e o expoente para potência: ");
                            int base = keyboard.nextInt();
                            int expoente = keyboard.nextInt();
                            System.out.println("Resultado: " + inteiro.potencia(base, expoente));
                            break;
                        case 3:
                            System.out.print("Digite o dividendo e o divisor para divisão: ");
                            int d1 = keyboard.nextInt();
                            int d2 = keyboard.nextInt();
                            System.out.println("Resultado: " + inteiro.divisao(d1, d2));
                            break;
                        case 4:
                            System.out.print("Digite um número para verificar se é par: ");
                            int p = keyboard.nextInt();
                            System.out.println("Resultado: " + (inteiro.par(p) ? "É par" : "É ímpar"));
                            break;
                        case 5:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } while (opcao != 5);

                keyboard.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
