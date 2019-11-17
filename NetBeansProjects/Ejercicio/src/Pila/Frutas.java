package Pila;
public class Frutas {
    private String Nombre;
    private String Tamaño;
    private String Maduracion;
    private String Color;

    public Frutas() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getMaduracion() {
        return Maduracion;
    }

    public void setMaduracion(String Maduracion) {
        this.Maduracion = Maduracion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    public void leer() {
        System.out.println("Ingrese el nombre de la fruta: ");
        Nombre = Leer.dato();
        System.out.println("Ingrese el tamaño de la fruta: ");
        Tamaño = Leer.dato();
        System.out.println("Ingrese si la fruta esta madura: ");
        Maduracion=Leer.dato();
        System.out.println("Ingrese el color de la fruta: ");
        Color=Leer.dato();

    }

    public void mostrar() {
        System.out.println("El nombre de la fruta es: "+Nombre);
        System.out.println("El tamaño de la fruta es: "+Tamaño);
        System.out.println("¿La fruta esta madura?"+Maduracion);
        System.out.println("El color de la fruta es: "+Color);
        System.out.println(" ");
    }
}
