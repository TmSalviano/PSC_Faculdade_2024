import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String args[]) {
        try (var keyboard = new Scanner(System.in)) {

            double[] firstDoubleArray = new double[10];

            for (int i = 0; i < 10; i++) {
                switch (i) {
                    case 0 -> System.err.println("Insira o primeiro número real do primeiro vetor:");
                    case 9 -> System.out.println("Insira o último número real:");
                    default -> System.out.println("Insira o próximo número real do primeiro vetor:");
                }
                firstDoubleArray[i] = keyboard.nextDouble();
            }

            double[] secondDoubleArray = new double[10];

            for (int i = 0; i < 10; i++) {
                switch (i) {
                    case 0 -> System.err.println("Insira o primeiro número real do segundo vetor:");
                    case 9 -> System.out.println("Insira o último número real:");
                    default -> System.out.println("Insira o próximo número real do segundo vetor:");
                }
                secondDoubleArray[i] = keyboard.nextDouble();
            }

            var thirdDoubleArray = new double[10];
            for (int i = 0; i < 10; i++) {
                thirdDoubleArray[i] = firstDoubleArray[i] + secondDoubleArray[i];
            }
            
            System.out.println("Os itens do primeiro vetor são:");
            System.out.println(Arrays.toString(firstDoubleArray));

            System.out.println("Os itens do segundo vetor são:");
            System.out.println(Arrays.toString(secondDoubleArray));

            System.out.println("Os itens do terceiro vetor, resultante da soma dos outros dois, são:");
            System.out.println(Arrays.toString(thirdDoubleArray));

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}