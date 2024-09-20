import java.util.*;
public class Matrix2x2 {
    public static void main(String[] args){
        //Declaração de variáveis //
        Scanner keyboard = new Scanner(System.in);
        int[][]A = new int[2][2];
        int[][]B = new int[2][2];
        int[][]C = new int[2][2];
        //Leitura dos valores da Matriz A
        System.out.println("Insira os valores da matriz A: ");
            for(int i = 0; i< 2; i++ ) {
                for(int j = 0; j< 2; j++){
                    System.out.print("A[" + i + "][" + j + "]: ");
                        A[i][j] = keyboard.nextInt();
                    
                }
            }
            //Leiteura dos valores da Matriz B 
            System.out.println("Insira os valores da matriz B: ");
            for(int i = 0; i< 2; i++ ) {
                for(int j = 0; j< 2; j++){
                    System.out.print("B[" + i + "][" + j + "]: ");
                        B[i][j] = keyboard.nextInt();
                }
            }
            //Multiplicação das duas Matrizes (A*B) e o armazenamento delas na Matriz C
                for(int i = 0; i< 2; i++){
                    for(int j = 0; j< 2; j++){
                        C[i][j] = (A[i][0] * B[0][j]) +(A[i][1] *  B[1][j]);
                    }
                }
                //Imprime o resultado da multiplicação da matriz A e B na matriz C // 
                System.out.println("\nO resultado da multiplicação da matriz 2 por 2 é: ");
                for(int i = 0; i< 2; i++ ) {
                    for(int j = 0; j< 2; j++){
                        System.out.print(C[i][j] + "\t");
                    }
                    //Quebra de linha
                    System.out.println();
               }
               //Fechamento do Scanner que foi declarado como keyboard
            keyboard.close(); 
        }
}