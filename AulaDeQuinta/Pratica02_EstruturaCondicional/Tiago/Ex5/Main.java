import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
           System.out.println("Insira o valor de x:");
           var x = keyboard.nextFloat();

           System.out.println("f(x) = ");
           if (x < -2)
                System.out.print((2*x + 2));
           else if (x >= -2 && x < 3)
                System.out.print(3);
           else
                System.out.print(x * -1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}