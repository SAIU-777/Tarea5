package formas;

public class Cuadrado extends Formas {
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }

    public double calcularArea() {
        return lado * lado;
    }
}
