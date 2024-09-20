import java.util.Scanner;

public class Matrix {
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

        // Impressão da matriz original
        System.out.println("\nMatriz original 5 por 5:");
        printMatrix(Matrix);

        // Troca de diagonais
        int n = Matrix.length;
        for (int i = 0; i < n; i++) {
            int temp = Matrix[i][i];
            Matrix[i][i] = Matrix[i][n - i - 1];
            Matrix[i][n - i - 1] = temp;
        }

        // Impressão da matriz com a troca de diagonais
        System.out.println("\nMatriz com a troca de diagonais:");
        printMatrix(Matrix);

        // Fechamento do scanner
        keyboard.close();
    }

    // Método para imprimir a matriz
    public static void printMatrix(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + "\t");
            }
            // Quebra de linha para a matriz não aparecer junta
            System.out.println();
        }
    }
}
