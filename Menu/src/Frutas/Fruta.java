package Frutas;

public class Fruta {

    private String nombre;
    private String color;
    private String peso;
    private String sabor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void modificarfruta(){
        System.out.println("Ingrese el nombre de reemplazo fruta: ");
        nombre = Leer.dato();
        System.out.println("Ingrese el color de reemplazo fruta: ");
        color = Leer.dato();
        System.out.println("Ingrese el peso de reemplazo fruta: ");
        peso = Leer.dato();
        System.out.println("Ingrese el sabor de reemplazo fruta: ");
        sabor = Leer.dato();
        System.out.println(" ");
    }

    public void llenar() {
        System.out.println("Ingrese el nombre de la fruta: ");
        nombre = Leer.dato();
        System.out.println("Ingrese el color de la fruta: ");
        color = Leer.dato();
        System.out.println("Ingrese el peso de la fruta: ");
        peso = Leer.dato();
        System.out.println("Ingrese el sabor de la fruta: ");
        sabor = Leer.dato();
    }

    public void mostrar() {
        System.out.println("El nombre de la Fruta es: " + nombre);
        System.out.println("El color de la Fruta es: " + color);
        System.out.println("El peso de la Fruta es: " + peso);
        System.out.println("El sabor de la Fruta es: " + sabor);
        System.out.println(" ");
    }
}
