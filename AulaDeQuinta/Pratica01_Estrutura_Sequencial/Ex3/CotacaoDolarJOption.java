import javax.swing.JOptionPane;
public class CotacaoDolarJOption {
    public static void main (String[] args) {
    Double ValorReais, Dolar, CotacaoDolar ; 
     
        CotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog ("Informe a cotação do Dolar atual: "));
         Dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que você possui em dólares: "));
       
         ValorReais =  CotacaoDolar * Dolar ;

        JOptionPane.showMessageDialog(null, "Seu valor em reais é:  " + ValorReais);
    }
}
