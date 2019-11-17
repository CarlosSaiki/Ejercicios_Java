package colas;

public class Cola {

    private int max;
    private int ini, fin;
    private int v[];

    public Cola() {
        max = 50;
        ini = fin = 0;
        v = new int[max];
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

    public void adicionar(int elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;

        } else {
            System.out.println("Cola simple llena");

        }
    }

    public int eliminar() {
        int elem = 0;
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
        int elem;
        if (esvacia()) {
            System.out.println("Cola vacia");
        } else {
            System.out.println("\n Datos de la Cola");
            Cola aux = new Cola();
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
            adicionar(Leer.datoInt());
        }
    }

    public void vaciar(Cola a) {
        while (!a.esvacia()) {
            adicionar(a.eliminar());

        }
    }

    public static void intercalar(Cola A, Cola B) {
        Cola C = new Cola();
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

    public void eliminardigito(Cola A, int n) {
        Cola B = new Cola();
        int sw = 0;
        while (!esvacia() && sw == 0) {
            int elem = A.eliminar();
            if (elem != n) {
                B.adicionar(elem);
            } else {
                sw = 1;
            }
        }
        A.vaciar(B);

    }

    public void eliminarmultiplo(Cola A) {
        System.out.println("Ingrese el numero multiplo a eliminar: ");
        int m = Leer.datoInt();
        int dig;
        Cola B = new Cola();
        int c = 0;
        int nroElem = A.nroelem();
        while (c < nroElem) {
            while (!A.esvacia()) {
                dig = A.eliminar();
                if (dig % m == 0) {
                } else {
                    B.adicionar(dig);
                }
            }
            A.vaciar(B);
            c = c + 1;
        }
        A.mostrar();
    }

    public void imppar(Cola A) {

        int dig;
        Cola B = new Cola();
        Cola C = new Cola();
        int c = 0;
        int nroElem = A.nroelem();
        while (c < nroElem) {
            while (!A.esvacia()) {
                dig = A.eliminar();
                if (dig % 2 == 0) {
                    B.adicionar(dig);
                } else {
                    C.adicionar(dig);
                }
            }
            A.vaciar(C);
            A.vaciar(B);
            c = c + 1;
        }
        A.mostrar();
    }

    public void sumar(Cola A) {

        int dig, sp = 0, si = 0;
        Cola B = new Cola();
        Cola C = new Cola();
        while (!A.esvacia()) {
            dig = A.eliminar();
            if (dig % 2 == 0) {
                B.adicionar(dig);
                sp = sp + dig;
            } else {
                C.adicionar(dig);
                si = si + dig;
            }
        }
        A.vaciar(C);
        A.vaciar(B);
        System.out.println("La suma de los elementos pares es: " + sp);
        System.out.println("La suma de los elementos impares es: " + si);
    }
    
}
