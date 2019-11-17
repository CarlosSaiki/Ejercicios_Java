package Subclases;

import Main.vehiculo;

public class acuatico extends vehiculo{
     private String id;

    public acuatico(String nombre, String modelo, String id) {
        super(nombre, modelo);
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Id: "+getId());
    }
    public void transportar(){
        System.out.println("Transportando por Agua..........");
    }
}
