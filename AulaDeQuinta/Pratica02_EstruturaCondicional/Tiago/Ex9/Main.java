import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("1 - Mercurio.");
            System.out.println("2 - Venus.");
            System.out.println("3 - Terra.");
            System.out.println("4 - Marte.");
            System.out.println("5 - Jupiter.");
            System.out.println("6 - Saturno.");
            System.out.println("7 - Urano.");
            System.out.println("8 - Netuno.");
            System.out.println("9 - Plutao.");
            System.out.println("Escolhar um planeta:");
            
            var planeta = keyboard.nextInt();

            if (planeta < 1 || planeta > 9) {
                System.out.println("Planeta invalido.");
                System.exit(1);
            }

            var g = switch (planeta) {
                case 1 -> 3.7;
                case 2 -> 8.8;
                case 3 -> 9.8;
                case 4 -> 3.8;
                case 5 -> 26.4;
                case 6 -> 11.5;
                case 7 -> 9.3;
                case 8 -> 12.2;
                case 9 -> 0.6;
                default -> throw new IllegalArgumentException("Unknown planet: " + planeta);
            };

            System.out.println("Insira uma velocidade inicial:"); 
            var v = keyboard.nextInt();

            System.out.println("Insira um instante:");
            var t = keyboard.nextInt();

            System.out.println("v(t): " + (v - (g * t))  + ". h(t) :" + ((v * t) - (g * Math.pow(t, 2) / 2)) + ".");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}