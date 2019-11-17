
package Pila;

public class principalfruta {
    public static void main(String[] args) {
        pilafrutas obj=new pilafrutas();
        
        System.out.println("Ingrese el tamaño de la pila");
        int x=Leer.datoInt();
        obj.llenar(x);
        obj.mostrar();
    }
  
}
