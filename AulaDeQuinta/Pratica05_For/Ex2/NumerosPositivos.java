
import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int Num1, Num2;
        do{
        System.out.println("Informe um número inteiro positivo: ");
            Num1 = keyboard.nextInt();
        System.out.println("Informe um segundo número positivo: ");
            Num2 = keyboard.nextInt();
        if(Num1 < 0 || Num2 < 0){
            System.out.println("Número informado é negativo, por favor digite um número inteiro");
            }
         }  while(Num1 < 0 || Num2 < 0 );
            int Inicio = Math.min(Num1, Num2);
            int Final = Math.max(Num1, Num2);

            System.out.println("Números entre: " + Inicio + " e " + Final + " : ");
             for(int i = Inicio; i <= Final; i++){
                System.out.println(i + " ");
             }
                System.out.println();
                    keyboard.close();
         }
 }
