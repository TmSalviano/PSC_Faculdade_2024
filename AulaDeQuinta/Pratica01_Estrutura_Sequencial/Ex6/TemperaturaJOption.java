import javax.swing.JOptionPane;

public class TemperaturaJOption{
    public static void main (String args[]){
    Double Temperatura, Celsius, Fahrenheit ; 
     
       Celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura atual em Celsius: "));
     
         Fahrenheit = ((Celsius * 1.8) + 32);

        JOptionPane.showMessageDialog(null, String.format( "A temperatura em Fahrenheit é: %.2f Graus", Fahrenheit ));
        System.exit (0);
    }
}