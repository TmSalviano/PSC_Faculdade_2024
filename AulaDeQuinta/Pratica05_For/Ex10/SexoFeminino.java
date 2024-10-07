import java.util.Scanner;
public class SexoFeminino {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       String[] Sexos = new String[10];
       int[] Idade = new int [10];
       double[] Peso = new double[10];
            for(int i = 0; i < 10; i++){
                
                System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
                    Sexos[i] = keyboard.next();
               
                 while (!Sexos[i].equalsIgnoreCase("M")&& !Sexos[i].equalsIgnoreCase("F")) { 
                    System.out.print("Entrada invalida, digite o sexo da pessoa: ");
                    Sexos[i] = keyboard.next();
                }

                System.out.print("Digite a idade das pessoas " + (i + 1) + " :");
                while(!keyboard.hasNextInt()){
                    System.out.print("Entrada invalida, digite a idade da pessoa: ");
                    keyboard.next();
                }
                    Idade[i] = keyboard.nextInt();
                 System.out.print("Digite o peso das pessoas " + (i + 1) + " :");
                  while(!keyboard.hasNextDouble()){
                    System.out.print("Entrada invalida, digite o peso da pessoa: ");
                    keyboard.next();
                  }
                  Peso[i] = keyboard.nextDouble();
            }
            int ContarMulheres = 0;
           for(int i = 0; i < 10; i++){
            if(Sexos[i].equalsIgnoreCase("F") && Idade[i] >= 20 && Idade[i] <= 40){
               ContarMulheres ++;
            }
           }
            System.out.println("Número de mulheres encontradas: " + ContarMulheres);
            keyboard.close();
           }
    }
