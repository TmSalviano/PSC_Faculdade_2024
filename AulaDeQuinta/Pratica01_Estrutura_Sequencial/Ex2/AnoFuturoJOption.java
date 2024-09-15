
import javax.swing.JOptionPane;
public class AnoFuturoJOption{
    public static void main (String [] args){
        int AnoNascimento, AnoAtual,  IdadeAtual, IdadeFuturo;
    
    AnoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
    AnoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual "));
    
        IdadeAtual = AnoAtual - AnoNascimento;

    JOptionPane.showMessageDialog(null, "Sua idade atual é: " + IdadeAtual);

        IdadeFuturo = 2050 - AnoNascimento;
    
    JOptionPane.showMessageDialog(null, "Sua idade em 2050 é: " + IdadeFuturo);
    }
}