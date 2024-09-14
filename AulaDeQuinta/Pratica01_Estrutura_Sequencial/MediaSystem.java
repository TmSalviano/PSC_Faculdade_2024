import java.util.*;
public class MediaSystem{
    public static void main (String [] args){
        int Num1, Num2, Num3, Media;
        Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a primeira nota: ");
        Num1 = teclado.nextInt();
    System.out.println("Digite a segunda nota: ");
        Num2 = teclado.nextInt();
    System.out.println("Digite a terceira nota: ");
        Num3 = teclado.nextInt();

    Media = (Num1 + Num2 + Num3) / 3;
    
    System.out.println("A media das suas notas é: " + Media);
    }
}