package Pila;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la primera pila: ");
        int r = leer.nextInt();
        PilaI pila = new PilaI();
        pila.llenar(r);
        System.out.println("Ingrese la dimension de la segunda pila: ");
        Scanner lee = new Scanner(System.in);
        int s = lee.nextInt();
        PilaI pila1 = new PilaI();
        pila1.llenar(s);
        pila1.mostrar();
        PilaI pilac = new PilaI();
        while (!pila.esvacia() && !pila1.esvacia()) {
            pilac.adicionar(pila.eliminar());
            pilac.adicionar(pila1.eliminar());
        }
        if (!pila.esvacia()) {
            while (!pila.esvacia()) {
                pilac.adicionar(pila.eliminar());
            }

        } else {
            while (!pila1.esvacia()) {
                pilac.adicionar(pila1.eliminar());
            }
            System.out.println("Entonces  combinando la pila nos queda como: ");
            pilac.mostrar();
        }

    }
}
