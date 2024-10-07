import  java.util.Scanner;
public class NumerosInteiros {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int SomaIdade = 0;
        int Contador = 0;
        int LimiteNumeros = 10;
        int MaiorNum = Integer.MIN_VALUE;
        int MenorNum = Integer.MAX_VALUE;
        int Num;
        System.out.println("Digite no máximo dez números, separados por espaço: ");
     String NumerosLinha = keyboard.nextLine();
     String[] Numeros = NumerosLinha.split(" ");
        if(Numeros.length != LimiteNumeros){
            System.out.println("Você deve digitar exatamente 10 números.");

        }else{
            for(int i = 0; i < Numeros.length; i++){
                 Num = Integer.parseInt(Numeros[i]);
                if (Num > MaiorNum){
                    MaiorNum = Num;
                }
                if (Num < MenorNum){
                    MenorNum = Num;
                }
            }
            System.out.println("O maior número informado é: " + MaiorNum);
            System.out.println("O menor número informado é: " + MenorNum);
        }
        keyboard.close();
    }

    }
