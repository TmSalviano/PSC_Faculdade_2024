import javax.swing.JOptionPane;

public class AreaLosango{
    public static void main (String args[]){
    Double DiagonalMaior, DiagonalMenor, Area ;
     DiagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho da diagonal maior: "));
     DiagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho da diagonal menor:"));
        
         Area = ((DiagonalMaior * DiagonalMenor)/2) ;

    JOptionPane.showMessageDialog(null, "A área total do seu losango é: " + Area );
        System.exit (0);
    }
}