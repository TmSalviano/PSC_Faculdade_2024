import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Insira a primeira nota:");
            var nota1 = inputLimiter(keyboard);

            System.out.println("Insira a segunda nota:");
            var nota2 = inputLimiter(keyboard);

            System.out.println("Insira a terceira nota:");
            var nota3 = inputLimiter(keyboard);

            var media = (nota1 + nota2 + nota3) / 3;
            if (media >= 0 && media < 3)
                System.err.println("Reprovado");
            else if (media >= 3 && media < 7)
                System.err.println("Exame");
            else
                System.err.println("Aprovado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static int inputLimiter(Scanner keyboard) {
        var num = keyboard.nextInt();
        while (num < 0 || num > 10)
        {
            System.out.println("Invalid number. Type a number from 0 to 10:");
            num = keyboard.nextInt();
        }
        return num;
    }
}