import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("1 - Homem");
            System.out.println("2 - Mulher");
            System.out.println("Insira o seu sexo:");
            
            var sexo = keyboard.nextInt();

            if (sexo != 1 || sexo != 2) {
                System.out.println("Sexo invalido");
                System.exit(1);
            }

            System.out.println("Insira a sua idade:");
            var idade = keyboard.nextInt();

            if (sexo == 1) {
                if (idade < 15)
                    System.out.println("Preco a cobrar: 60R$");
                if (idade > 15 && idade < 19)
                    System.out.println("Preco a cobrar: 75R$");
                if (idade > 18 && idade < 31)
                    System.out.println("Preco a cobrar: 90R$");
                if (idade > 30 && idade < 41)
                    System.out.println("Preco a cobrar: 85R$");
                if (idade > 40)
                    System.out.println("Preco a cobrar: 80R$");
            } else {
                if (idade < 18)
                    System.out.println("Preco a cobrar: 60R$");
                if (idade > 18 && idade < 26)
                    System.out.println("Preco a cobrar: 90R$");
                if (idade > 26 && idade < 41)
                    System.out.println("Preco a cobrar: 85R$");
                if (idade > 40)
                    System.out.println("Preco a cobrar: 80R$");
            }
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}