package Subclases;
public class barco extends acuatico {
    
    public barco(String nombre, String modelo, String id) {
        super(nombre, modelo, id);
    }
    public void encender(){
        System.out.println("Encender..........");
    }
}
