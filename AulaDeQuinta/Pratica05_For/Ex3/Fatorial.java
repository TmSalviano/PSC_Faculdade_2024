import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        int Num;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo para que seja calculado o seu fatorial");
            Num = keyboard.nextInt();
            if(Num < 0){
                System.out.println("Número digitado é negativo, por favor digite um número positivo");
            }else{
                long Resultado = Fatorial(Num);
                 System.out.println("O fatorial de: " + Num + " é: " + Resultado );
            }
            keyboard.close();
    }
    public static long Fatorial(int n){
        long Resultado = 1;
         System.out.print(n + "! = ");
         for(int i = 1; i <= n ; i++){
            Resultado *= i;
                System.out.print(i);
            
            if(i < n){
                System.out.print(" x ");
            }
         }
         System.out.println(" = " + Resultado);
          return Resultado;
         }
    
    }

