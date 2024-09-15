
import javax.swing.JOptionPane;
public class Esfera {
    public static void main(String[] args) {
       
    double Raio, Comprimento, Area, Volume;

        Raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o Raio da esfera: "));
        
            Comprimento = 2 * Math.PI * Raio;
        JOptionPane.showMessageDialog(null, String.format("O comprimento da esfera é: %.2f\n", Comprimento));

            Area = Math.PI * (Raio * Raio);
            JOptionPane.showMessageDialog(null, String.format("A área desta esfera é: %.2f\n", Area));

            Volume = (4/3) * Math.PI * (Raio * Raio * Raio);
        JOptionPane.showMessageDialog(null, String.format("O valor do volume desta esfera é: %.2f\n", Volume));

  
    }
}
