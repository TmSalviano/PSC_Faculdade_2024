import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
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
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Cálculo da matriz transposta
        int[][] transposta = new int[Matrix[0].length][Matrix.length];
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                transposta[j][i] = Matrix[i][j]; // Inversão de linhas por colunas
            }
        }

        // Impressão da matriz transposta
        System.out.println("\nA matriz 5 por 5 transposta é:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }

        // Fechamento do scanner
        keyboard.close();
    }
}
