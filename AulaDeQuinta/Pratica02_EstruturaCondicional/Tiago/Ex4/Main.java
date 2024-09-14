import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Insira o seu peso:");
            var peso = keyboard.nextFloat();
            System.out.println("Insira a sua altura:");
            var altura = keyboard.nextFloat();

            var imc = (int)(peso / Math.pow(altura, 2));
            if (imc < 20) {
                System.out.println("Abaixo do Peso");
            } else if (imc >= 20 && imc < 25) {
                System.out.println("Normal");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("Sobrepeso");
            } else if (imc >= 30 && imc <= 40) {
                System.out.println("Obesidade");
            } else if (imc > 40) {
                System.out.println("Obesidade Morbida");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}