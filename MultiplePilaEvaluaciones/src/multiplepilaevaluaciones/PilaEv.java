package multiplepilaevaluaciones;

import java.util.Scanner;

public class PilaEv {

    int tope;
    int max = 30;
    Evaluacion[] v = new Evaluacion[max];

    PilaEv() {
        tope = 0;
    }

    boolean esvacia() {
        if (tope == 0) {
            return true;
        }
        return false;
    }

    boolean esllena() {
        if (tope == max) {
            return true;
        }
        return false;
    }

    int nroelementos() {
        return tope;
    }

    void adicionar(Evaluacion elementos) {
        if (!esllena()) {
            tope++;
            v[tope] = elementos;

        } else {
            System.out.println("Pila llena");
        }

    }

    Evaluacion eliminar() {
        Evaluacion elementos = new Evaluacion();
        if (!esvacia()) {
            elementos = v[tope];
            tope--;

        } else {
            System.out.println("Pila es vacia");

        }
        return elementos;
    }

    void mostrar() {
        Evaluacion elementos;
        if (esvacia()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("\n Datos de la Pila");
            PilaEv aux = new PilaEv();
            while (!esvacia()) {
                elementos = eliminar();
                aux.adicionar(elementos);
                System.out.println("Nombre: " + elementos.getNom() + " Nota: " + elementos.getNota());

            }
            vaciar(aux);
        }
    }

    void llenar(int z) {

        for (int i = 1; i <= z; i++) {
            Evaluacion l = new Evaluacion();
            l.leer();;
            adicionar(l);
        }

    }

    public void vaciar(PilaEv A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
}
