import javax.swing.JOptionPane;

public class PesoPessoa {
    public static void main(String[] args){
        double Peso, PesoEngordar, PesoEmagrecer;

    Peso =  Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
    
    //Calcula o ganho de peso em 15%
    PesoEngordar = Peso + (Peso * 0.15) ;
    JOptionPane.showMessageDialog(null, String.format("Se você engordar seu peso será de: %.2f kg\n", PesoEngordar));
    
    //Calcula a perca de peso com 20%
    PesoEmagrecer = Peso - (Peso * 0.20) ;
    JOptionPane.showMessageDialog(null, String.format("Se você emagrecer seu peso será de: %.2f kg\n", PesoEmagrecer));
    System.exit(0);
    }
}
