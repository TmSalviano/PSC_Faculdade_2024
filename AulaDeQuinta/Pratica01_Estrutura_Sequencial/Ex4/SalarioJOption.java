import javax.swing.JOptionPane;

public class SalarioJOption {
    public static void main (String args[]){
        double Salario, SalarioAumento;
    
    Salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário: "));
    
        SalarioAumento = Salario + ( Salario * 0.25) ;
    
    JOptionPane.showMessageDialog(null, "O seu salário com aumento de 25% é: " + SalarioAumento);
    }
}