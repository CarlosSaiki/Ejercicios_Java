package examenedd;

import java.util.Scanner;

public class PilaDistribuidor {
    private int tope;
    private int max;
    private Distribuidor[] p;

    public PilaDistribuidor() {
        this.tope = 0;
        this.max = 50;
        this.p = new Distribuidor[this.max];
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

    public void adicionar(Distribuidor elementos) {
        if (!esllena()) {
            this.tope++;
            p[this.tope] = elementos;

        } else {
            System.out.println("pila llena");
        }

    }

    public Distribuidor eliminar() {
        Distribuidor elementos = new Distribuidor("","","","");
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
        Distribuidor elementos;
        if (esvacia()) {
            System.out.println("pila vacia");
        } else {
            
            PilaDistribuidor aux = new PilaDistribuidor();
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
                Distribuidor l=new Distribuidor(" ", "", "", "");
                l.llenar();
                adicionar(l);
            }
        }

    }

    public void vaciar(PilaDistribuidor A) {
        while (!A.esvacia()) {
            adicionar(A.eliminar());
        }
    }
}
