package Pila;

import java.util.Scanner;

public class PilaF {
    private int tope;
    private int max;
    private Fraccion[] p;

    public PilaF() {
        this.tope = 0;
        this.max = 50;
        this.p = new Fraccion[this.max];
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

    public void adicionar(Fraccion elementos) {
        if (!esllena()) {
            this.tope++;
            p[this.tope] = elementos;

        } else {
            System.out.println("pila llena");
        }

    }

    public Fraccion eliminar() {
        Fraccion elementos = new Fraccion();
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
        Fraccion elementos;
        if (esvacia()) {
            System.out.println("pila vacia");
        } else {
            System.out.println("\n Datos de la Pila");
            PilaF aux = new PilaF();
            while (!esvacia()) {
                Fraccion x = eliminar();
                aux.adicionar(x);
                x.mostrar();

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
                
            System.out.println("Fraccion: ");
                Fraccion x = new Fraccion();
                x.leer();
                adicionar(x);
            }
        }

    }

    public void vaciar(PilaF A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
}
