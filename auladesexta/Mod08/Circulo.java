package auladesexta.Mod08;

public class Circulo {
    private int x;
    private int y;

    private double raio;
    private static double PI = 3.14; 

    public double area() {
        return Math.PI * Math.pow(raio,2);
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public void moveX(int x1) {
        this.x += x1;
    }

    public void moveY(int y1) {
        this.y += y1;
    }

    public void aumentarRaio(int) {

    }
}
