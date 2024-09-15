import javax.swing.JOptionPane;
public class QuantidadeSalarioJOption{
    public static void main (String args[]){
    int SalarioMinimo, SalarioBruto, Valor;
    
        SalarioMinimo =  Integer.parseInt(JOptionPane.showInputDialog("Informe o salário mínimo: "));
         SalarioBruto =  Integer.parseInt(JOptionPane.showInputDialog("Informe o salário bruto que você ganha:"));
        
         Valor = SalarioBruto / SalarioMinimo ; 

          JOptionPane.showMessageDialog(null, "O valor de salários minímos que você ganha é: " + Valor);
        
    }
}