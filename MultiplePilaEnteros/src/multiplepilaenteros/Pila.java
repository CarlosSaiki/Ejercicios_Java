package multiplepilaenteros;

import java.util.Scanner;

public class Pila {

    private int tope;
    private int max = 50;
    private int[] v = new int[max];

    public Pila() {
        tope = 0;
    }

    public boolean esvacia() {
        if (tope == 0) {
            return true;
        }
        return false;
    }

    public boolean esllena() {
        if (tope == max - 1) {
            return true;
        }
        return false;
    }

    public int nroelementos() {
        return tope;
    }

    public void adicionar(int elementos) {
        if (!esllena()) {
            tope++;
            v[tope] = elementos;

        } else {
            System.out.println("Pila llena");
        }

    }

    int eliminar() {
        int elementos = 0;
        if (!esvacia()) {
            elementos = v[tope];
            this.tope--;

        } else {
            System.out.println("Pila es vacia");

        }
        return elementos;
    }

    void mostrar() {
        int elementos;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila");
            Pila aux = new Pila();
            while (!esvacia()) {
                elementos = eliminar();
                aux.adicionar(elementos);
                System.out.println(elementos);

            }
            while (!aux.esvacia()) {
                elementos = aux.eliminar();
                adicionar(elementos);
            }
        }
    }

    void llenar(int z) {

        for (int i = 1; i <= z; i++) {
            int l = Leer.datoInt();
            adicionar(l);
        }

    }

    public void vaciar(Pila A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
}
