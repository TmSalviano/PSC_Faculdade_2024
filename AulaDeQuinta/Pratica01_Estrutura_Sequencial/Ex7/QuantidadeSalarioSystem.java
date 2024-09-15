import java.util.*;
public class Salario{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    int SalarioMinimo, SalarioBruto, Valor;
    
        System.out.println("Informe o salário mínimo: ");
         SalarioMinimo = teclado.nextInt();
    
         System.out.println("Informe o salário bruto que você ganha:");
         SalarioBruto = teclado.nextInt();

         Valor = SalarioBruto / SalarioMinimo ; 

         System.out.println ("O valor de salários minímos que você ganha é: " + Valor);
        
    
     teclado.close();
    }
}