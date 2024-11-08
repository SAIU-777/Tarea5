package formas;

public class Circulo extends Formas {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }

    public double calcularRadio() {
        return radio;
    }
}
