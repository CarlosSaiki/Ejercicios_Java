package colas;

public class ColaStrings {

    private int max;
    private int ini, fin;
    private String v[];

    public ColaStrings() {
        max = 50;
        ini = fin = 0;
        v = new String[max];
    }

    public boolean esvacia() {
        if (ini == 0 && fin == 0) {
            return (true);
        }
        return (false);
    }

    public boolean esllena() {
        if (fin == max - 1) {
            return (true);
        }
        return (false);
    }

    public int nroelem() {
        return (fin - ini);
    }

    public void adicionar(String elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;

        } else {
            System.out.println("Cola simple llena");

        }
    }

    public String eliminar() {
        String elem = "";
        if (!esvacia()) {
            ini++;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }

        } else {
            System.out.println("Cola simple vacia");
        }
        return elem;
    }

    public void mostrar() {
        String elem = "";
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola");
            ColaStrings aux = new ColaStrings();
            while (!esvacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println(" " + elem);

            }
            vaciar(aux);
        }
    }

    public void llenar(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            adicionar(Leer.dato());
        }
    }

    public void vaciar(ColaStrings a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());

        }
    }

    public void intercalar(ColaStrings A, ColaStrings B) {
        ColaStrings C = new ColaStrings();
        while (!A.esvacia() && !B.esvacia()) {
            C.adicionar(A.eliminar());
            C.adicionar(B.eliminar());
        }
        if (!A.esvacia()) {
            C.vaciar(A);
        } else {
            C.vaciar(B);
        }
        C.mostrar();
    }

}
