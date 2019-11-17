package Pila;

import java.util.Scanner;

public class PilaC {

    private int tope;
    private int max;
    private Caja[] p;

    public PilaC() {
        this.tope = 0;
        this.max = 50;
        this.p = new Caja[this.max];
    }

    public boolean esvacia() {
        if (tope != 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean esllena() {
        if (tope == max - 1) {
            return true;
        } else {
            return false;
        }

    }

    public int nroelementos() {
        return this.tope;
    }

    public void adicionar(Caja elementos) {
        if (!esllena()) {
            this.tope++;
            p[this.tope] = elementos;

        } else {
            System.out.println("pila llena");
        }

    }

    public Caja eliminar() {
        Caja elementos = new Caja();
        if (!esvacia()) {
            elementos = p[this.tope];
            this.tope--;
            return elementos;

        } else {
            System.out.println("pila es vacia");
            return elementos;
        }
    }

    public void mostrar() {
        Caja elementos;
        if (esvacia()) {
            System.out.println("pila vacia");
        } else {
            System.out.println("\n Datos de la Pila");
            PilaC aux = new PilaC();
            while (!esvacia()) {
                elementos = eliminar();
                aux.adicionar(elementos);
                elementos.mostrar();

            }
            while (!aux.esvacia()) {
                adicionar(aux.eliminar());

            }
        }
    }

    public void llenar(int z) {
        Scanner leer = new Scanner(System.in);
        if (esllena()) {
            System.out.println("Pila lena");
        } else {
            System.out.println("Ingrese datos a la pila");

            for (int i = 1; i <= z; i++) {
                Caja l = new Caja();
                l.leer();
                adicionar(l);
            }
        }

    }

    public void vaciar(PilaC A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
}
