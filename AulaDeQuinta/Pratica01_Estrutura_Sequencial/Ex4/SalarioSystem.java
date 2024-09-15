import java.util.*;
public class SalarioSystem {
    public static void main (String args[]){
        Scanner keyboard = new Scanner(System.in);
        double Salario, SalarioAumento;
    
    System.out.println("Informe o seu salário: ");
        Salario = keyboard.nextDouble();
    
        SalarioAumento = Salario + ( Salario * 0.25) ;
    
    System.out.println("O seu salário com aumento de 25% é: " + SalarioAumento);
    }
}