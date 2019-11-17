package Subclases;
public class avion extends aereo{
    
    public avion(String nombre, String modelo, String id) {
        super(nombre, modelo, id);
    }
    public void encender(){
        System.out.println("Encender..........");
    }
    
}
