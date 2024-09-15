import java.util.*;
public class Tabuada{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    int Num;
    
        System.out.println("Informe um número para ver sua tabuada: ");
         Num = teclado.nextInt();
    
        for (int i = 1; i <= 10; i++){

        System.out.println (Num +" X " + i + " = " + (Num * i));
        }
     teclado.close();
    }
}