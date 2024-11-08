package formas;

public class Formas {
    private String color;

    public Formas(String color) {
        this.color = color;
    }

    public void dibujar() {
        System.out.println("Dibujando una forma generica");
    }

    public void establecerColor(String color) {
        this.color = color;
        System.out.println("El color de la forma es ahora " + color);
    }

    public String getColor() {
        return color;
    }
}
