package Pila;
import java.util.Scanner;


public class dos {

    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
       Pila pila=new Pila();
       System.out.println("Ingrese la dimension de la  pila: ");
       int r = leer.nextInt();
       pila.llenar(r);
       pila.mostrar();
       
       
    }

}
