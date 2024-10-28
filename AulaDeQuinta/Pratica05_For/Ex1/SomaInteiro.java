public class SomaInteiro {
    public static void main(String[] agrs){
        int Soma = 0;

        for(int i = 7; i <= 20; i++){
            System.out.println("Somando " + i + " ao total " + Soma);
            Soma += i;
            System.out.println("Somando: " + i + ", o resultado é: " + Soma);
        }
        System.out.println("A soma total dos números de 7 a 20 é: " + Soma);
    }
}
