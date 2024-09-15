import java.util.Scanner;
public class Temperatura{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
    Double Temperatura, Celsius, Fahrenheit ; 
     
        System.out.println("Informe a temperatura atual em Celsius: ");
         Celsius = teclado.nextDouble();
     
         Fahrenheit = ((Celsius * 1.8) + 32);

        System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit );
        System.exit (0);
    }
}