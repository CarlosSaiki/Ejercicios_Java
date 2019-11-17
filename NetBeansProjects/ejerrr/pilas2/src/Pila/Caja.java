package Pila;


public class Caja {

    private String color, tam;

    
    public Caja() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public void leer() {
        System.out.println("Ingrese el color de la caja");
        color = Leer.dato();
        System.out.println("Ingrese el tamaño de la caja");
        tam = Leer.dato();

    }

    public void mostrar() {
        System.out.println(color + " " + tam);
    }
}
