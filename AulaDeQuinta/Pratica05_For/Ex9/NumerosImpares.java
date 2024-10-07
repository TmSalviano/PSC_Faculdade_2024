import java.util.Scanner;
public class NumerosImpares {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int Limite;
        System.out.println("Digite um número inteiro");
            int Num = keyboard.nextInt();
        System.out.println("Os números impares de 1 até o " + Num + " são: ");
            for(int i = 1; i <= Num; i ++){
                if(i % 2 !=0){
                    System.out.println(i);

                }
            }
            keyboard.close();
    }
    
}
