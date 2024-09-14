import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Insert the value of the first side of the triangle: ");
            var side1 = keyboard.nextDouble();
            System.out.println("Insert the value of the second side of the triangle: ");
            var side2 = keyboard.nextDouble();
            System.out.println("Insert the value of the third side of the triangle: ");
            var side3 = keyboard.nextDouble();

            if (side1 == side2 && side1 == side3)
                System.out.println("O triangulo e equilatero");
            else if (side1 != side2 && side2 != side3)
                System.out.println("O triangulo e escaleno");
            else
                System.out.println("O triangulo e isoceles");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}