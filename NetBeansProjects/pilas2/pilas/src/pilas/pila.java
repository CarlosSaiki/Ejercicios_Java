package pilas;

import java.util.Scanner;

public class pila {

    private int tope;
    private int max;
    private int[] p;

    public pila() {
        this.tope = 0;
        this.max = 50;
        this.p = new int[this.max];
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

    public void adicionar(int elementos) {
        if (!esllena()) {
            this.tope++;
            p[this.tope] = elementos;

        } else {
            System.out.println("pila llena");
        }

    }

    public int eliminar() {
        int elementos = 0;
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
        int elementos = 0;
        if (esvacia()) {
            System.out.println("pila vacia");
        } else {
            pila aux = new pila();
            while (!esvacia()) {
                elementos = eliminar();
                System.out.println(elementos);
                aux.adicionar(elementos);

            }
            while (!aux.esvacia()) {
                adicionar(aux.eliminar());

            }
        }
    }

    public void llenar(int z) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Llenar la pila: ");
        for (int i = 1; i <= z; i++) {
            adicionar(leer.nextInt());
        }

    }

    public void vaciar(pila A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
}
