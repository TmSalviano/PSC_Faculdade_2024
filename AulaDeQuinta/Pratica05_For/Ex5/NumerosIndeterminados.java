import java.util.Scanner;
public class NumerosIndeterminados {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int MaiorNum = Integer.MIN_VALUE;
        int MenorNum = Integer.MAX_VALUE;
        System.out.println("Digite a quantidade números que deseja informar");
            int QuantidadeNum = keyboard.nextInt();
        
        for(int i = 0; i < QuantidadeNum; i++){
            System.out.print("Digite o número " + (i+1) + " : ");
                int Num = keyboard.nextInt();
    
        if( Num > MaiorNum){ 
            MaiorNum = Num;
        }
        if(Num < MenorNum){
            MenorNum = Num;
        }
    }
    System.out.println("O maior número é: " + MaiorNum);
    System.out.println("O menor número é: " + MenorNum);

        keyboard.close();
    }
}

