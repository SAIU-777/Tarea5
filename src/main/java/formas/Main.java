package formas;

public class Main {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo("Rojo", 5);
        Linea linea = new Linea("Azul", 10);
        Triangulo triangulo = new Triangulo("Verde", 45);
        Cuadrado cuadrado = new Cuadrado("Amarillo", 4);

        
        circulo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();

        
        circulo.establecerColor("Violeta");
        System.out.println("Color del circulo: " + circulo.getColor());

        
        System.out.println("Radio del circulo: " + circulo.calcularRadio());
        System.out.println("Largo de la linea: " + linea.getLargo());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}

