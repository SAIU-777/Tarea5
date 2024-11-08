package formas;

public class Linea extends Formas {
    private double largo;

    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una linea");
    }

    public double getLargo() {
        return largo;
    }
}
