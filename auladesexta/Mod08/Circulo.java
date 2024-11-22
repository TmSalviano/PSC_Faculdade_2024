package auladesexta.Mod08;

public class Circulo {
    private int x;
    private int y;
    private double raio;
    private static double PI = 3.14; 
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }
    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
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
    public void aumentarRaio(int aumento) {
        this.raio += aumento;
    }
    public void exibe() {
        System.out.println("Centro (" + this.x + ", " + this.y+ ")");
        System.out.println("Raio: " + this.raio);
        System.out.println("Area: " + this.area());
        System.out.println("Perimetro: " +this.perimetro());
    }
}
