import javax.swing.JOptionPane;

public class Tabuada{
    public static void main (String args[]){
    int Num;
    
        Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para ver sua tabuada: "));
        
        StringBuilder tabuada = new StringBuilder();
        for (int i = 1; i <= 10; i++){
        tabuada.append(Num).append(" X ").append(i).append(" = ").append(Num * i).append("\n");
        }
        JOptionPane.showMessageDialog(null, tabuada.toString());
        
    }
}