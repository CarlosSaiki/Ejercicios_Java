package Frutas;

import java.util.Scanner;

public class PilaFruta {

    private int tope;
    private int max;
    private Fruta[] p;

    public PilaFruta() {
        this.tope = 0;
        this.max = 50;
        this.p = new Fruta[this.max];
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

    public void adicionar(Fruta elementos) {
        if (!esllena()) {
            this.tope++;
            p[this.tope] = elementos;

        } else {
            System.out.println("pila llena");
        }

    }

    public Fruta eliminar() {
        Fruta elementos = new Fruta();
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
        Fruta elementos;
        if (esvacia()) {
            System.out.println("pila vacia");
        } else {
            
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
                Fruta l = new Fruta();
                l.llenar();
                adicionar(l);
            }
        }

    }

    public void vaciar(PilaFruta A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }

    public void igualar(PilaFruta A, String x) {
        PilaFruta B = new PilaFruta();
        Fruta aux;
        while (!A.esvacia()) {
            aux = A.eliminar();
            B.adicionar(aux);
            if (aux.getNombre().equals(x)) {
                System.out.println("El nombre de la fruta buscada es: \n" + aux.getNombre() + "\nEl color de la fruta es: \n" + aux.getColor() + "\nEl peso de la fruta es: \n" + aux.getPeso() + "\nEl sabor de la fruta es: \n" + aux.getSabor());
            }
        }
        A.vaciar(B);
    }

    public void modificar(PilaFruta A, String x) {
        PilaFruta B = new PilaFruta();
        Fruta aux;

        while (!A.esvacia()) {
            aux = A.eliminar();
            if (aux.getNombre().equals(x)) {

                aux.modificarfruta();
                B.adicionar(aux);
            } else {
                B.adicionar(aux);
            }
        }
        A.vaciar(B);
    }

    public void eliminarfruta(PilaFruta A, String x) {
        PilaFruta E = new PilaFruta();
        Fruta aux;
        while (!A.esvacia()) {
            aux = A.eliminar();
            if (aux.getNombre().equals(x)) {

            } else {
                E.adicionar(aux);
            }
        }
        A.vaciar(E);
    }
}
