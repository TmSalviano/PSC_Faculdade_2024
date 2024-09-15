import java.util.*;
public class PesoPessoaSystem {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double Peso, PesoEngordar, PesoEmagrecer;

    System.out.println("Informe seu peso: ");
        Peso = keyboard.nextDouble();
    
    //Calcula o ganho de peso em 15%
    PesoEngordar = Peso + (Peso * 0.15) ;
    System.out.printf("Se você engordar seu peso será de: %.2f kg\n", PesoEngordar);
    
    //Calcula a perca de peso com 20%
    PesoEmagrecer = Peso - (Peso * 0.20) ;
    System.out.printf("Se você emagrecer seu peso será de: %.2f kg\n", PesoEmagrecer);
    keyboard.close();
    System.exit(0);
    }
}
