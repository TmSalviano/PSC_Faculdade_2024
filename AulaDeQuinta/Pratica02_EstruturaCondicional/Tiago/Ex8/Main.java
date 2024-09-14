import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
           
            System.out.println("Insira o codigo do produto:");
            switch (keyboard.nextInt()) {
                case 1:
                    System.out.println("R$ 99,99.");
                break;
                case 2:
                    System.out.println("R$ 103,89.");
                break;
                case 3:
                    System.out.println("R$ 949,98.");
                break;
                case 4:
                    System.out.println("R$ 89,72.");
                break;
                case 5:
                    System.out.println("R$ 97,35.");
                break;
                default:
                    System.out.printn("Codigo invalido.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}