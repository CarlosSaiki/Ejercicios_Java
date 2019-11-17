package clase1pilas;

import java.util.Scanner;

public class Pila {

    private int tope;
    private int max;
    private int v[];

    public Pila() {
        tope = 0;
        max = 50;
        v = new int[max];
    }

    public boolean esVacia() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esllena() {
        if (tope == max - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return tope;
    }

    public void adicionar(int elem) {
        if (esllena()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            v[tope] = elem;
        }
    }

    public int eliminar() {
        int elem = 0;
        if (esVacia()) {
            System.out.println("Pila Vacia");
            return elem;
        } else {
            elem = v[tope];
            tope--;
            return elem;
        }
    }

    public void mostrar() {
        int elem;
        if (esVacia()) {
            System.out.println("Pila Vacia");
        } else {
            Pila aux = new Pila();
            while (!esVacia()) {
                elem = eliminar();
                System.out.println(elem);
                aux.adicionar(elem);
            }
            while (!aux.esVacia()) {
                adicionar(aux.eliminar());
            }
        }
    }

    public void llenar(int n) {
        Scanner leer = new Scanner(System.in);

        if (esllena()) {
            System.out.println("Pila llena");
        } else {
            for (int i = 1; i <= n; i++) {
                adicionar(leer.nextInt());

            }
        }
    }

    public void Vaciar(Pila aux) {
        while (!aux.esVacia()) {
            adicionar(aux.eliminar());
        }
    }
}
