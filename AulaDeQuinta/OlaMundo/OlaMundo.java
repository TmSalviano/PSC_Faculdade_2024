import java.util.Scanner;

public class OlaMundo {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        System.out.println("Informe o primeiro número:");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo número:");
        num2 = teclado.nextInt();
        System.out.println("Valor informado: " + (num1 + num2));
        teclado.close();
        System.exit(0);
    }
}