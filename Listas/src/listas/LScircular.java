package listas;

public class LScircular extends ListaSimple {

    public LScircular() {
        super();
    }

    boolean esvacia() {
        if (p == null) {
            return true;
        }
        return false;
    }

    void adiprimero(int d) {
        NodoS w = new NodoS();
        NodoS r;
        w.dato = d;
        if (esvacia()) {
            p = w;
            p.sig = p;
        } else {
            r = p;
            w.sig = p;
            while (r.sig != p) {
                r = r.sig;
            }
            p = w;
            r.sig = p;
        }
    }

    void adiprimero(NodoS n) {
        NodoS r;
        if (esvacia()) {
            p = n;
            p.sig = p;
        } else {
            r = p;
            n.sig = p;
            while (r.sig != p) {
                r = r.sig;
            }
            p = n;
            r.sig = p;
        }

    }

    void adiultimo(int d) {
        NodoS w = new NodoS();
        NodoS r;
        w.dato = d;
        if (esvacia()) {
            p = w;
            p.sig = p;
        } else {
            r = p;
            while (r.sig != p) {
                r = r.sig;
            }
            r.sig=w;
            w.sig=p;
            
        }
    }

    void adiultimo(NodoS n) {
        NodoS r;
        if (!esvacia()) {
            p = n;
            p.sig = p;
        } else {
            r = p;
            while (r.sig != p) {
                r = r.sig;
            }
            r.sig = n;
            r.sig = p;
        }
    }

    void leer1(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            adiprimero(Leer.datoInt());
        }
    }

    void leer2(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            adiultimo(Leer.datoInt());
        }
    }

    void mostrar() {
        NodoS r;
        r = p;
        while (r.sig != p) {
            System.out.println(" " + r.dato);
            r = r.sig;
        }
        System.out.println(" " + r.dato);
    }

    NodoS eliprimero() {
        NodoS x, r;
        x = p;
        p = p.sig;
        x.sig = null;
        r = p;
        while (r.sig != x) {
            r = r.sig;
        }
        r.sig = p;
        return x;

    }

    NodoS eliultimo() {
        NodoS x, r;
        x = r = p;
        if (r.sig == p) {
            p = null;
        } else {
            while (r.sig != p) {
                x = r;
                r = r.sig;
            }

        }
        x.sig = p;
        x = r;
        return (x);
    }

    void llevafinal() {
        p = p.sig;
    }

    void llevafinal(int k) {
        int i;
        for (i = 1; i <= k; i++) {
            llevafinal();
        }

    }
}
