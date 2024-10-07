import java.util.Scanner;
public class IdadePessoas {
    public static void main(String[] agrs){
        Scanner keyboard = new Scanner(System.in);
            int SomaIdade = 0;
            int Contador = 0;
            int LimiteIdades = 10;
            System.out.println("Digite no máximo dez números, separados por espaço: ");
         String NumerosLinha = keyboard.nextLine();
         String[] Numeros = NumerosLinha.split(" ");
            
            
                for(int i = 0; i < Numeros.length && i < LimiteIdades; i++){
                int Idade = Integer.parseInt(Numeros[i]);
                if(Idade >=0 && Idade <=10 ){
                    SomaIdade += Idade;
                    Contador ++;
                }
            }
            if(Contador > 0){
                double Media = (double) SomaIdade / Contador;
                    System.out.println("A média das idades informadas é: " + Media);
            }
    }
    
}
