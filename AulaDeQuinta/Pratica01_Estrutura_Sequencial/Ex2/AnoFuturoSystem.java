import java.util.*;
public class AnoFuturoSystem{
    public static void main (String [] args){
        int AnoNascimento, AnoAtual,  IdadeAtual, IdadeFuturo;
        Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Digite seu ano de nascimento");
        AnoNascimento = keyboard.nextInt();
    System.out.println("Digite o ano atual: ");
        AnoAtual = keyboard.nextInt();
    
        IdadeAtual = AnoAtual - AnoNascimento;

    System.out.println("Sua idade atual é: " + IdadeAtual);

        IdadeFuturo = 2050 - AnoNascimento;
    
    System.out.println("Sua idade em 2050 é: " + IdadeFuturo);
     keyboard.close();
    }
}