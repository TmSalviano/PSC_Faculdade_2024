import javax.swing.JOptionPane;
public class PitagorasJOption{
    public static void main(String[] args) {
    double Cateto1, Cateto2, Hipotenusa;
    Cateto1 =  Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do primeiro cateto: "));
    Cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do segundo cateto: "));

        Hipotenusa = Math.sqrt((Cateto1 * Cateto1) + (Cateto2 * Cateto2));
    
        JOptionPane.showMessageDialog(null, String.format("O valor da hipotenusa é: %.2f", Hipotenusa));
    }
}
