package colas;
public class Persona {
    private String Nombre;
    private int Edad;

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public void leer(){
        System.out.println("Persona: ");
        System.out.println("Ingrese el nombre de la persona");
        Nombre=Leer.dato();
        System.out.println("Ingrese la edad de la persona");
        Edad=Leer.datoInt();
    }
    public void mostrar(){
        System.out.println(Nombre+" "+Edad+"***");
    }
}
