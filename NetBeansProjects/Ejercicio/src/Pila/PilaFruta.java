package Pila;

import java.util.Scanner;

public class PilaFruta {
    private int tope;
    private int max;
    private Frutas[] p;

    public PilaFruta() {
        this.tope = 0;
        this.max = 50;
        this.p = new Frutas[this.max];
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

    public void adicionar(Frutas elementos) {
        if (!esllena()) {
            this.tope++;
            p[this.tope] = elementos;

        } else {
            System.out.println("pila llena");
        }

    }

    public Frutas eliminar() {
        Frutas elementos = new Frutas();
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
        Frutas elementos;
        if (esvacia()) {
            System.out.println("pila vacia");
        } else {
            System.out.println("\n Los datos de la Pila nos queda: ");
            PilaFruta aux = new PilaFruta();
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

            for (int i = 1; i <= z; i++) {
                Frutas l = new Frutas();
                l.leer();
                adicionar(l);
            }
        }

    }

    public void vaciar(PilaFruta A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
    
}
