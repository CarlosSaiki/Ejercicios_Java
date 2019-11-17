package Principal;

import Clases.Digitos;
import java.util.Scanner;

public class Eje01 {

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Ingrese un numero por favor");
            Scanner leer = new Scanner(System.in);
            n = leer.nextInt();
        } while (n <= 9);
        System.out.println(n);
        Digitos veri = new Digitos(n);
        veri.Contar();
        veri.Invertir();
        veri.Multiplos();
        veri.Primos();
    }
}
