package Principal;

import Clases.Series;
import java.util.Scanner;

public class Eje07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la serie:  ");
        n = leer.nextInt();
        Series obj1 = new Series(n);
        obj1.llenar3();
        obj1.mostrar();

    }
}
