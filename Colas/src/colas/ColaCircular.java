package colas;

public class ColaCircular {

    private int max;
    private int ini, fin;
    private Fraccion v[];

    public ColaCircular() {
        max = 50;
        ini = fin = 0;
        v = new Fraccion[max];
    }

    public int nroelem() {
        return ((max + fin - ini) % max);
    }

    public boolean esvacia() {
        if (nroelem() == 0) {
            return (true);
        }
        return (false);
    }

    public boolean esllena() {
        if (nroelem() == max - 1) {
            return (true);
        }
        return (false);
    }

    public void adicionar(Fraccion elem) {
        if (!esllena()) {
            fin = (fin + 1) % max;
            v[fin] = elem;

        } else {
            System.out.println("Cola Circular Llena");

        }
    }

    public Fraccion eliminar() {
        Fraccion elem = new Fraccion();
        if (!esvacia()) {
            ini = (ini + 1) % max;
            elem = v[ini];
            if (nroelem() == 0) {
                ini = fin = 0;
            }

        } else {
            System.out.println("Cola Circular vacia");
        }
        return elem;
    }

    public void mostrar() {
        Fraccion elem;
        if (esvacia()) {
            System.out.println("Cola vacia xxx");
        } else {
            System.out.println("\n Datos de la Cola");
            ColaCircular aux = new ColaCircular();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrar();

            }
            vaciar(aux);
        }
    }

    public void llenar(int n) {

        for (int i = 1; i <= n; i++) {
            Fraccion elem = new Fraccion();
            elem.leer();
            adicionar(elem);
        }
    }

    public void vaciar(ColaCircular a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());

        }
    }
}
