import java.util.Scanner;
public class PotenciaInteiros {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int Base, Expoente;
        System.out.println("Informe a Base: ");
            Base = keyboard.nextInt();
        System.out.println("Informe o Expoente: ");
            Expoente = keyboard.nextInt();

            long Resultado = Potencia( Base, Expoente);

        System.out.println(Base + " elevado a " + Expoente + " é: " + Resultado);
        keyboard.close();
    }
        public static long Potencia(int Base, int Expoente){
            long Resultado = 1;
            if(Expoente == 0){
                return 1;
            }
            for(int i = 1; i <= Expoente; i++){
                Resultado *= Base;

            }
            return Resultado;
        }
}
