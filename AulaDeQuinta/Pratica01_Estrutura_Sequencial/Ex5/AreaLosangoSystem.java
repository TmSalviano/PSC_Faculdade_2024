import java.util.Scanner;
public class AreaLosangoSystem{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
    Double DiagonalMaior, DiagonalMenor, Area ;
     System.out.println("Informe o tamanho da diagonal maior: ");
         DiagonalMaior = teclado.nextDouble();
     System.out.println("Informe o tamanho da diagonal menor:");
         DiagonalMenor = teclado.nextDouble();
        
         Area = ((DiagonalMaior * DiagonalMenor)/2) ;

     System.out.println("A área total do seu losango é: " + Area );
        System.exit (0);
    }
}