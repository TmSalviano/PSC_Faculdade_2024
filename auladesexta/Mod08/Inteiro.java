package auladesexta.Mod08;

public class Inteiro {
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return b < 0 ? -resultado : resultado;
    }

    // Método de potenciação usando multiplicação
    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    // Método de divisão usando apenas subtração
    public int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        int resultado = 0;
        int valorAbsolutoA = Math.abs(a);
        int valorAbsolutoB = Math.abs(b);
        while (valorAbsolutoA >= valorAbsolutoB) {
            valorAbsolutoA -= valorAbsolutoB;
            resultado++;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0) ? -resultado : resultado;
    }

    // Método para verificar se um número é par
    public boolean par(int a) {
        return a % 2 == 0;
    }
}
