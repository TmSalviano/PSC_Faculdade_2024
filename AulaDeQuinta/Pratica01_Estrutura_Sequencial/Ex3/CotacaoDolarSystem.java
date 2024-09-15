import java.util.Scanner;
public class CotacaoDolar{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
    Double ValorReais, Dolar, CotacaoDolar ; 
     
        System.out.println("Informe a cotação do Dolar atual: ");
         CotacaoDolar = teclado.nextDouble();
     
         System.out.println("Informe o valor que você possui em dólares: ");
         Dolar = teclado.nextDouble();
       
         ValorReais =  CotacaoDolar * Dolar ;

        System.out.println("Seu valor em reais é: " + ValorReais );
        System.exit (0);
    }
}