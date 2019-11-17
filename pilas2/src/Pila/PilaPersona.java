package Pila;

import java.util.Scanner;

public class PilaPersona {

    private int tope;
    private int max;
    private Persona[] p;

    public PilaPersona() {
        this.tope = 0;
        this.max = 50;
        this.p = new Persona[this.max];
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

    public void adicionar(Persona elementos) {
        if (!esllena()) {
            this.tope++;
            p[this.tope] = elementos;

        } else {
            System.out.println("pila llena");
        }

    }

    public Persona eliminar() {
        Persona elementos = null;
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
        Persona elementos = null;
        if (esvacia()) {
            System.out.println("pila vacia");
        } else {
            PilaPersona aux = new PilaPersona();
            while (!esvacia()) {
                elementos = eliminar();
                elementos.mostrar();
                aux.adicionar(elementos);

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
                System.out.println("Introduzca nombre: ");
                String a = leer.nextLine();
                System.out.println("Introduzca apellido: ");
                String b = leer.nextLine();
                Persona obj = new Persona(a, b);
                adicionar(obj);
            }
        }

    }

    public void vaciar(PilaPersona A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
}
