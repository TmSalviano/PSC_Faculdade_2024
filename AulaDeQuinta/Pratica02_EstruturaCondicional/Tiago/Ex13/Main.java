import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("1 - apartamento simples.");
            System.out.println("2 - apartamento duplo.");
            System.out.println("Insira ao tipo de apartamento:");
            var apt = keyboard.nextInt();

            if (apt != 1 || apt != 2)
                System.out.println("Tipo de apartamento invalido.");   

            System.out.println("Insira a quantidade de dias:");
            var dias = keyboard.nextInt();

            if (apt == 1) {
                if ( dias < 10)
                    System.out.println("100,00R$.");
                else if ( dias >= 10 && dias < 16)
                    System.out.println("90,00R$.");    
                else if ( dias > 15)
                    System.out.println("85,00R$.");
            }
            else {
                if ( dias < 10)
                 System.out.println("140,00R$.");
                else if ( dias >= 10 && dias < 16)
                    System.out.println("120,00R$.");    
                else if ( dias > 15)
                 System.out.println("100,00R$.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}