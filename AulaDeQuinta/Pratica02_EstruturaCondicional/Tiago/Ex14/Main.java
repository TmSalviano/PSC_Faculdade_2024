import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        try (var keyboard = new Scanner(System.in)) {
            System.out.println("Insira um comando git:");

            switch (keyboard.nextLine()) {
                case "git clone":
                    System.out.println("Clona algum repositorio do github. ");
                break;
                case "git fetch":
                    System.out.println("Desce mudancas do repositorio remoto para o repositorio local sem que haja merge na sua branch local.");
                break;
                case "git pull":
                    System.out.println("Desce as mudancas do repo remoto e automaticamente faz o merge para a sua branch local.");
                break;
                default:
                    System.out.println("Os unicos comandos validos sao: git pull, git fetch e git clone.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}