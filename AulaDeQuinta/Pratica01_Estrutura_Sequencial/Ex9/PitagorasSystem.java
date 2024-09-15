import java.util.*;
public class Pitagoras {
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
    double Cateto1, Cateto2, Hipotenusa;
     System.out.println("Informe o valor do primeiro cateto: ");
        Cateto1 = keyboard.nextDouble();
    System.out.println("Informe o valor do segundo cateto: ");
        Cateto2 = keyboard.nextDouble();

        Hipotenusa = Math.sqrt((Cateto1 * Cateto1) + (Cateto2 * Cateto2));
    
    System.out.printf("O valor da hipotenusa é: %.2f\n", Hipotenusa);
    keyboard.close();
    }
}
