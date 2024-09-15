import java.util.*;
public class Esfera {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    double Raio, Comprimento, Area, Volume;

        System.out.println("Informe o Raio da esfera: ");
            Raio = keyboard.nextDouble();
        
            Comprimento = 2 * Math.PI * Raio;
        System.out.printf("O comprimento da esfera é: %.2f\n", Comprimento);

            Area = Math.PI * (Raio * Raio);
        System.out.printf("A área desta esfera é: %.2f\n", Area);

            Volume = (4/3) * Math.PI * (Raio * Raio * Raio);
        System.out.printf("O valor do volume desta esfera é: %.2f\n", Volume);

        keyboard.close();
    }  
}
