import java.util.*;

public class Matriz{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[][] Matrix = new int[5][5];

        // Leitura dos valores da matriz inseridos pelo usuário
        System.out.println("Informe os valores da matriz 5 por 5:");
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                Matrix[i][j] = keyboard.nextInt();
            }
        }

        // Impressão dos números pares da matriz
        System.out.println("\nNúmeros pares da matriz 5 por 5:");
        for (int i = 0; i < Matrix.length; i++) { // Percorre a matriz
            for (int j = 0; j < Matrix[i].length; j++) {
                if (Matrix[i][j] % 2 == 0) { // Verifica se é par
                    System.out.print(Matrix[i][j] + "\t");
                }
            }
        }

        // Impressão dos números ímpares da matriz
        System.out.println("\nNúmeros ímpares da matriz 5 por 5:");
        for (int i = 0; i < Matrix.length; i++) { // Percorre a matriz
            for (int j = 0; j < Matrix[i].length; j++) {
                if (Matrix[i][j] % 2 != 0) { // Verifica se é ímpar
                    System.out.print(Matrix[i][j] + "\t");
                }
            }
        }

        // Fechamento do scanner
        keyboard.close();
    }
}
