package formas;

public class Triangulo extends Formas {
    private double angulo;

    public Triangulo(String color, double angulo) {
        super(color);
        this.angulo = angulo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo");
    }

    public double calcularArea() {
        return (angulo / 2);  
    }
}
