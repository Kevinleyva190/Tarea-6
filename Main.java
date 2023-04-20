public class Main {
    public static void main(String[] args) {
    Cuadrado cua= new Cuadrado();
    cua.setLado(5);
    System.out.println("Area="+cua.calcularArea());
    Circulo cir = new Circulo();
    cir.setRadio(2.4);
    System.out.println("Area="+cir.calcularArea());
    }
}