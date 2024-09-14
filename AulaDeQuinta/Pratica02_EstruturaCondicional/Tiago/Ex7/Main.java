import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Sua funcao do segundo grau.");

            System.out.println("Insira o valor de a:");
            var a = keyboard.nextInt();

            System.out.println("Insira o valor de b:");
            var b= keyboard.nextInt();

            System.out.println("Insira o valor de c:");
            var c = keyboard.nextInt();

            if (a == 0 && b == 0 && c == 0)
                System.out.println("Igualdade confirmada: 0 = 0.");
            else if (a == 0 && b == 0 && c != 0)
                System.out.println("“Coeficientes informados incorretamente”.");
            else if (a == 0 && b != 0) 
                System.out.println("Esta e uma equacao do primeiro grau: " + -c/b);
            else {
                System.out.println("Esta e uma equacao do segudno grau.");
                var delta = Math.pow(b, 2) -(4 * a * c);
                if (delta < 0)
                    System.out.println("Essa equacao nao possui valores reais.");
                else if (delta == 0)
                    System.out.println("Essa equacao possui duas raizes reais iguas: " + ((-b + Math.sqrt(delta)) / (2 * a)));
                else 
                    System.out.println("Essa equacao possui duas raizes reais diferentes. Raiz 1: " + ((-b + Math.sqrt(delta)) / (2 * a)) + ". Raiz 2: " + ((-b - Math.sqrt(delta)) / (2 * a))) ;
            }




        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}