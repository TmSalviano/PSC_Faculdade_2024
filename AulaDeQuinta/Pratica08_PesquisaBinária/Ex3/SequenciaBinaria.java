import java.util.Scanner;
public class SequenciaBinaria {
    public static void main(String[] args) {
        int[] Vetor1 = new int [5];
        int[] Vetor2 = new int [5];
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Digite os valores do primeiro vetor: ");
     for(int i = 0; i < Vetor1.length; i++){
        System.out.println("Digite um número natural para a posição " + i + " do vetor ");
        int Num = keyboard.nextInt();
            while(ExisteVetor(Vetor1, i, Num)){
                System.out.println("Número " + Num + " já existente no primeiro vetor");
                Num = keyboard.nextInt();
            }
        Vetor1[i] = Num;
     }
        System.out.println("Digite os valores do segundo vetor");
        for(int i = 0; i < Vetor2.length; i++){
            System.out.println("Digite um número natural para a posição " + i + " do vetor");
            int Num = keyboard.nextInt();

        while(ExisteVetor(Vetor2, i, Num) || ExisteVetor(Vetor1, Vetor1.length, Num)){
            if(ExisteVetor(Vetor2, i, Num)){
                System.out.println(  Num + " já informado no segundo vetor");
            }else{
                System.out.println(  Num + " já informado no primeiro vetor");
            }
            Num = keyboard.nextInt();
        }
        Vetor2[i] = Num;
        }
        System.out.println("\nVetor 1: ");
        ImprimirVetoresComPosicoes(Vetor1);
        System.out.println("\nVetor 2: ");
        ImprimirVetoresComPosicoes(Vetor2);

        int[] VetorUnido = UnirVetor(Vetor1, Vetor2);

        System.out.println("\nVetores Unidos: ");
        ImprimirVetoresComPosicoes(VetorUnido);

        keyboard.close();
    }
    public static  boolean ExisteVetor(int[] Vetor, int TamanhoAtual, int Num){
        for (int i = 0; i < TamanhoAtual; i++){
            if(Vetor[i] == Num){
                return true;
            }
        }
        return false;
    }
    public static void ImprimirVetoresComPosicoes(int[] Vetor){
        for(int i = 0; i < Vetor.length; i++){
            System.out.println("Posição " + i + ": " + Vetor[i]);
        }
    }
    public static int[] UnirVetor(int [] Vetor1, int[] Vetor2){
        int [] VetorUnido = new int[Vetor1.length + Vetor2.length];

        for (int i = 0; i < Vetor1.length; i++){
            VetorUnido[i] = Vetor1[i];
        }
        for (int i = 0; i < Vetor2.length; i++){
            VetorUnido[Vetor1.length + i] = Vetor2[i];
        }
        return VetorUnido;
    }
}
