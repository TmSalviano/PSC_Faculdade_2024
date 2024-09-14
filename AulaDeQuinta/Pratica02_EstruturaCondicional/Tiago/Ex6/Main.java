import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Insira o valor de x:");
            var x = keyboard.nextDouble();
            System.out.println("Insira o valor de y:");
            var y = keyboard.nextDouble();
            System.out.println("Insira o valor de z:");
            var z = keyboard.nextDouble();

            if (x < y + z && y < x + z && z < x + y)
                System.out.println("Os valoraes podem formar um triangulo.");
            else
                System.out.print("Os valores nao podem formar um triangulo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}