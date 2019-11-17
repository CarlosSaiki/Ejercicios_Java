package Arrays;

import Clases.Vector;
import java.util.Scanner;

public class Eje02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese la dimension del vector:  ");
        n = leer.nextInt();
        Vector obj1=new Vector(n);
        obj1.llenar();
        obj1.mostrar();
        obj1.rotar();
        obj1.mostrar();
        
    }
}
