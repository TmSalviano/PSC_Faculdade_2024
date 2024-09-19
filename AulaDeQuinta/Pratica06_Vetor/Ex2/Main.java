import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String args[]) {
        try (var keyboard = new Scanner(System.in)) {

            double[] doubleArray = new double[10];

            for (int i = 0; i < 10; i++) {
                switch (i) {
                    case 0 -> System.err.println("Insira o primeiro número real:");
                    case 9 -> System.out.println("Insira o último número real:");
                    default -> System.out.println("Insira o próximo número real:");
                }
                doubleArray[i] = keyboard.nextDouble();
            }
            
            System.out.println("Os itens do vetor são:");
            System.out.println(Arrays.toString(doubleArray));

            System.out.println("As posições onde encontram-se os números negativos no vetor são: ");
            for (int i = 0; i < 10; i++) {
                if (i == 9 && i <  0) {
                    System.out.print(i + ".");
                    return;
                }
                if (doubleArray[i] < 0)
                    System.out.print(i + ", ");
            }

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}