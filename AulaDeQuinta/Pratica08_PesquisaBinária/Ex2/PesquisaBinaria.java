import java.util.Arrays;
import java.util.Scanner;

public class PesquisaBinaria {
    public static void main(String[] args) {
        int[] vetor = new int [10];
        Scanner keyboard = new Scanner(System.in);
            for(int i = 0; i < vetor.length; i++){
                System.out.print("Digite um número para a posição  " + i + " do vetor: ");
                 vetor[i] = keyboard.nextInt();
            }
            Arrays.sort(vetor);
            System.err.println("Digite o número a ser procurado: ");
            int BuscadoNumero = keyboard.nextInt();
            int Comparacoes = PesquisaBinariaA(vetor, BuscadoNumero);

            if(Comparacoes == -1){
                System.out.println("Número solicitado não foi encontrado no vetor");
            }else{
                System.out.println("Número encontrado com: " + Comparacoes + " comparações" );
            }
            keyboard.close();
    }
    public static int PesquisaBinariaA(int[] vetor, int BuscadoNumero){
        int Inicio = 0;
        int Final = vetor.length - 1;
        int Comparacoes = 0;

        while(Inicio <= Final){
            Comparacoes++;
            int Metade = (Inicio + Final) /2;

            if(vetor[Metade] == BuscadoNumero ){
                return Comparacoes;
            }else if(vetor[Metade] < BuscadoNumero ){
                Inicio = Metade + 1;
            }else{
                Final = Metade - 1;
                 }
             }
             return -1;
        }
    }

