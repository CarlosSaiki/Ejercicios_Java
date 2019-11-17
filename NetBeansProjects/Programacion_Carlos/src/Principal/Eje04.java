package Principal;

import Clases.Suma;
import java.util.Scanner;

public class Eje04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la suma:  ");
        n = leer.nextInt();
        Suma obj1=new Suma(n);
        obj1.llenar();
        obj1.mostrar();
    }
    
}
