package Principal;

import Clases.Aritmetica;

import java.util.Scanner;

public class Carlos {

    public static void main(String[] args) {
        try {
            int n1, n2;
            System.out.println("Ingrese el Primer numero: ");
            Scanner leer = new Scanner(System.in);
            n1 = leer.nextInt();
            System.out.println("Ingrese el Segundo numero: ");
            n2 = leer.nextInt();
            Aritmetica Cartagena = new Aritmetica(n1, n2);
            Cartagena.Diferencia();
            Cartagena.Producto();
            Cartagena.Division();
        } finally {
            System.out.println("Muchas gracias, hasta luego.");
        }
    }

}
