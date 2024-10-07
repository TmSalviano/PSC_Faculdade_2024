import java.util.Scanner;
public class PesquisaSequencial{
    public static void main(String[] args) {
        int[] vetor = new int [10];
        Scanner keyboard = new Scanner(System.in);
            for(int i = 0; i < vetor.length; i++){
                System.out.print("Digite um número para a posição  " + i + " do vetor: ");
                 vetor[i] = keyboard.nextInt();
            }
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("1-Pesquisa sequêncial simples ");
            System.out.println("2-Pesquisa sequêncial com sentinela ");
                int opcao = keyboard.nextInt();
            
            switch (opcao) {
                case 1:
                pesquisaSequencialSimples(vetor, keyboard);
                    
                    break;
                case 2:
                pesquisaSequencialComSentinela(vetor, keyboard);
                 break;
                default:
                System.out.println("Opção invalidada");
            }
            keyboard.close();
    }

public static void pesquisaSequencialSimples(int [] vetor, Scanner keyboard) {
    System.out.print("Digite o número a ser procurado pelo vetor: ");
    int NumeroBuscado = keyboard.nextInt();

    boolean encontrado = false;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == NumeroBuscado) {
                System.out.println("O número buscado foi eencontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Número informado não foi encontrado em nenhuma posição");
        }
}
public static void pesquisaSequencialComSentinela(int [] vetor, Scanner keyboard) {
    System.out.println("Digite o número a ser procurado no vetor: ");
    int BuscadoNumero = keyboard.nextInt();

    int UltimoValor = vetor[vetor.length - 1];
    vetor[vetor.length - 1] = BuscadoNumero;

    int i = 0;
    
        while(vetor[i] !=BuscadoNumero){
        i++;
    }
    vetor[vetor.length - 1] = UltimoValor;

    if(i < vetor.length -1 || vetor[vetor.length - 1] == BuscadoNumero){
        System.out.println("O número informado foi achado na posição: " + i);
    }else{
        System.out.println("O número informado não foi encontrado em nenhuma posição.");
         }
    }
}