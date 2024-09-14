import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Insira a primeira nota:");
            var nota1 = keyboard.nextInt();
            System.out.println("Insira a primeira nota:");
            var nota2 = keyboard.nextInt();

            if ((nota1 + nota2) / 2  >= 7)
                System.out.println("Aprovado");
            else
                System.out.println("Reprovado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}