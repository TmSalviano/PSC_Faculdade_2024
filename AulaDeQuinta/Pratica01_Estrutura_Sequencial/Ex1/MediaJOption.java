import javax.swing.JOptionPane;

public class MediaJOption {
    public static void main(String[] args) {
        int Num1, Num2, Num3, Media;

        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
        Num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota: "));

        Media = (Num1 + Num2 + Num3) / 3;

        JOptionPane.showMessageDialog(null, "A média das suas notas é: " + Media);
    }
}

