import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String args[]) {
        try (var keyboard = new Scanner(System.in)) {

            int[] intArray = new int[10];

            for (int i = 0; i < 10; i++) {
                switch (i) {
                    case 0 -> System.err.println("Insira o primeiro número inteiro:");
                    case 9 -> System.out.println("Insira o último número inteiro:");
                    default -> System.out.println("Insira o próximo número inteiro:");
                }

                intArray[i] = keyboard.nextInt();
            }

            System.out.println("Os itens do vetor são:");
            System.out.println(Arrays.toString(intArray));

            var total = 0;
            for (var num : intArray) {
                if (num % 2 == 0)
                    total += num;
            }

            System.out.println("A soma dos números pares é igual a: " + total + ".");

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}