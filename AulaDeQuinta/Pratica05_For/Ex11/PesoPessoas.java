import java.util.Scanner;
public class PesoPessoas {
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
          int ContagemHomens = 0;
          int ContagemMulheres = 0;
            for(int i = 0; i <10; i++ ){
                if(Sexos[i].equalsIgnoreCase("M") && Peso[i] >= 60 && Peso[i] <= 80){
                    ContagemHomens ++;
                }
                if(Sexos[i].equalsIgnoreCase("F") && Peso[i] >= 50 && Peso[i] <= 70){
                    ContagemMulheres ++;
                }
            }
            System.out.println("Número de homens com peso entre 60 e 80 kg é: " + ContagemHomens);
            System.out.println("Número de mulheres com peso entre 50 e 70 kg é: " + ContagemMulheres);
           }
           
    }

    

