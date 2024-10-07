import  java.util.Scanner;
public class IdadeIndeterminada {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int SomaIdades = 0;
        int Contador = 0;
        System.out.println("Digite o número de idades que deseja informar");
            int QuantidadeIdades = keyboard.nextInt();
        
        for(int i = 0; i < QuantidadeIdades; i++){
            System.out.print("Digite a idade " + (i+1) + ": ");
                int Idade = keyboard.nextInt();

                SomaIdades += Idade;
                    Contador ++ ;
        }
        if(Contador > 0){
            double Media = (double) SomaIdades / Contador;
                System.out.println("A média das idades é: " + Media);
         
        }
        keyboard.close();
    }
}
 