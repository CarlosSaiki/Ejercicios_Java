package Menu;

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

    public void igualar(Cola A, int n) {
        int igu = n;
        int dig;
        Cola B = new Cola();
        Cola C = new Cola();
        int c = 0;
        int nroElem = A.nroelem();

        while (c < nroElem) {
            while (!A.esvacia()) {
                dig = A.eliminar();
                C.adicionar(dig);
                if (dig == igu) {
                    B.adicionar(dig);
                }
            }
            c = c + 1;
        }
        B.mostrar();
        A.vaciar(C);
    }

    public void modificar(Cola A, int n) {
        int igu = n;
        int dig;
        Cola B = new Cola();
        Cola C = new Cola();
        int c = 0;
        int nroElem = A.nroelem();

        while (c < nroElem) {
            while (!A.esvacia()) {
                dig = A.eliminar();
                if (dig == igu) {
                    System.out.println("Ingrese el nuevo numero de reemplazo: ");
                    dig=Leer.datoInt();
                    C.adicionar(dig);
                    B.adicionar(dig);
                } else {
                    C.adicionar(dig);
                }

            }
            c = c + 1;
        }
        A.vaciar(C);
    }

    public void eliminarcola(Cola A, int n) {
        int igu = n;
        int dig;
        Cola B = new Cola();
        Cola C = new Cola();
        int c = 0;
        int nroElem = A.nroelem();

        while (c < nroElem) {
            while (!A.esvacia()) {
                dig = A.eliminar();
                if (dig == igu) {
                } else {
                    B.adicionar(dig);
                }
            }
            c = c + 1;
        }
        
        A.vaciar(B);
    }

    public void ordenarmay(Cola A) {
        int may = 0;
        int dig;
        Cola B = new Cola();
        Cola C = new Cola();
        int c = 0;
        int nroElem = A.nroelem();
        while (c < nroElem) {
            while (!A.esvacia()) {
                dig = A.eliminar();
                if (dig > may) {
                    may = dig;
                }
                B.adicionar(dig);
            }
            B.eliminardigito(B, may);
            A.vaciar(B);
            C.adicionar(may);
            may = 0;
            c = c + 1;
        }
        A.vaciar(C);
    }

    public void ordenarmen(Cola A) {
        int men = 1000;
        int dig;
        Cola B = new Cola();
        Cola C = new Cola();
        int c = 0;
        int nroElem = A.nroelem();
        while (c < nroElem) {
            while (!A.esvacia()) {
                dig = A.eliminar();
                if (dig < men) {
                    men = dig;
                }
                B.adicionar(dig);
            }
            B.eliminardigito(B, men);
            A.vaciar(B);
            C.adicionar(men);
            men = 1000;
            c = c + 1;
        }
        A.vaciar(C);
    }

}
