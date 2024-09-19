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


            var menorValor = Double.MAX_VALUE;
            var maiorValor = Double.MIN_VALUE;
            for (var num : doubleArray) {
                if (num > maiorValor)
                    maiorValor = num;
                if (num < menorValor)
                    menorValor = num;
            }
            
            System.out.println("O menor e o maior valor do vetor são: " + menorValor+ " e " + maiorValor+ ".");

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}