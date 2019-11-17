package multiplepilaevaluaciones;

public class MultiplePilaEv {

    PilaEv v[] = new PilaEv[20];
    int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    MultiplePilaEv() {
        for (int i = 1; i < 20; i++) {
            v[i] = new PilaEv();

        }
    }

    int nroPilas() {
        return (n);
    }

    int nroelementos(int i) {
        return (v[i].nroelementos());
    }

    boolean esvacia(int i) {
        if (v[i].esvacia()) {
            return true;
        }
        return false;
    }

    boolean esllena(int i) {
        if (v[i].esllena()) {
            return true;
        }
        return false;
    }

    void adicionar(int i, Evaluacion L) {
        if (!v[i].esllena()) {
            v[i].adicionar(L);
        } else {
            System.out.println("Pila " + i + " esta llena");
        }
    }

    Evaluacion eliminar(int i) {
        Evaluacion e = new Evaluacion();
        if (!v[i].esvacia()) {
            e = v[i].eliminar();
        } else {
            System.out.println("Pila " + i + " esta vacia");
        }
        return e;
    }

    void llenar(int i, int n) {
        v[i].llenar(n);
    }

    void llenar(int m) {
        int i;
        n=m;
        for (i = 1; i <=n; i++) {
            System.out.println("\nNro. elementos Pila "+i+":");
            int k=Leer.datoInt();
            v[i].llenar(k);
        }
    }

    void mostrar() {
        for (int i = 1; i <= n; i++) {
            System.out.println("\n\nDatos Pila " + i + " ");
            mostrar(i);
        }
    }

    void mostrar(int i) {
        v[i].mostrar();;
    }

    void vaciar(int i, PilaEv Z) {
        v[i].vaciar(Z);
    }

    public void vaciar(int i, int j) {
        v[i].vaciar(v[j]);
    }

}
