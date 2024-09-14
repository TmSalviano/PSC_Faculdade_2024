import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Insira o valor de a:");
            var a = keyboard.nextInt();

            System.out.println("Insira o valor de b:");
            var b= keyboard.nextInt();

            System.out.println("1 - Somar os dois números.");
            System.out.println("2 - Multiplicar os dois números.");
            System.out.println("3 - Subtrair o número maior pelo número menor (se os dois forem iguais, retorne zero).");
            System.out.println("4 - Dividir o primeiro número pelo segundo (lembre-se de que não existe divisão por\r\n" + //
                                "zero).");
            
            var option = keyboard.nextInt();
            switch (option) {
                case 1:
                     System.out.println(a + b);
                    break;
                case 2:
                     System.out.println(a * b);
                    break;
                case 3:
                    if (a > b)
                        System.out.println(a - b);
                    else
                        System.out.println(b - a);
                    break;
                case 4:
                    if (a == 0)
                        System.out.println(a / b);
                    else if (b == 0)
                        System.out.println(b / a);
                    else
                        System.out.println(a / b);
                    break;
            
                default:
                    System.out.println("opcao invalida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}