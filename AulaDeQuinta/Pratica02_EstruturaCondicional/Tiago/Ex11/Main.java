import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Insira o total de diarias:");
            var diarias = keyboard.nextInt();

            int taxa;
            if (diarias < 15) {
                taxa = 15;
            } else if (diarias == 15) {
                taxa = 10;
            } else { // diarias > 15
                taxa = 5;
            }

            System.out.println("Preco a pagar: " + 500 + (taxa * diarias));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}