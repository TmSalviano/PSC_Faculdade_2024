import java.util.*;
public class Matrix {
    public static void main(String[] args){
        //Declaração das variáveis 
        Scanner keyboard = new Scanner (System.in);
        int [][] Matrix = new int[5][5];
        //Leitura e armazenamento das matriz A 
        System.out.println("Informe os valores da matriz 5 por 5:  ");

            for(int i = 0; i < Matrix.length; i++){
                for(int j = 0; j< Matrix[i].length; j++) {
                    System.out.print("Matrix[" + i + "][" + j + "]:");
                    Matrix[i][j] = keyboard.nextInt();
                }
            }
            //Impresão das matriz A informada pelo usuario
            System.out.println("\nA matriz 5 por 5 é: ");

            for(int i = 0; i < Matrix.length; i++){
                for(int j = 0; j< Matrix[i].length; j++) {
                    System.out.print(Matrix[i][j] + "\t");
                }
                //Quebra de linha, para na hora que rodar o programa a matriz não fiquei colada
                System.out.println();
            }
            //Fechamento do teclado
            keyboard.close();
    }
    
}
//Aitivdade 1A//