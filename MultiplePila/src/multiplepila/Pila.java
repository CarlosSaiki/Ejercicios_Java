package multiplepila;

import java.util.Scanner;

public class Pila {

    private int tope;
    private int max;
    private Cancion[] v;

    public Pila() {
        tope = 0;
        max = 30;
        v = new Cancion[max];
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

    public void adicionar(Cancion elementos) {
        if (!esllena()) {
            tope++;
            v[tope] = elementos;

        } else {
            System.out.println("pila llena");
        }

    }

    public Cancion eliminar() {
        Cancion elementos = new Cancion();
        if (!esvacia()) {
            elementos = v[tope];
            this.tope--;

        } else {
            System.out.println("pila es vacia");

        }
        return elementos;
    }

    public void mostrar() {
        Cancion elementos = new Cancion();
        if (esvacia()) {
            System.out.println("pila vacia");
        } else {
            System.out.println("\n Datos de la Pila");
            Pila aux = new Pila();
            while (!esvacia()) {
                elementos = eliminar();
                aux.adicionar(elementos);
                elementos.mostrar();

            }
            vaciar(aux);

        }
    }

    public void llenar(int z) {

        for (int i = 1; i <= z; i++) {
            Cancion l = new Cancion();
            l.leer();
            adicionar(l);
        }

    }

    public void vaciar(Pila A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
}
