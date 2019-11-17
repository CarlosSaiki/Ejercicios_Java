package listasencapsuladas;

public class LScircular extends ListaSimple {

    public LScircular() {
        super();
    }

    boolean esvacia() {
        if (getP() == null) {
            return true;
        }
        return false;
    }

    void adiprimero(int d) {
        NodoS w = new NodoS();
        NodoS r;
        w.setDato(d);
        if (esvacia()) {
            setP(w);
            getP().setSig(getP());
        } else {
            r = getP();
            w.setSig(getP());
            while (r.getSig() != getP()) {
                r = r.getSig();
            }
            setP(w);
            r.setSig(getP());
        }
    }

    void adiprimero(NodoS n) {
        NodoS r;
        if (esvacia()) {
            setP(n);
            getP().setSig(getP());
        } else {
            r = getP();
            n.setSig(getP());
            while (r.getSig() != getP()) {
                r = r.getSig();
            }
            setP(n);
            r.setSig(getP());
        }
    }

    void adiultimo(int d) {
        NodoS w = new NodoS();
        NodoS r;
        w.setDato(d);
        if (esvacia()) {
            setP(w);
            getP().setSig(getP());
        } else {
            r = getP();
            while (r.getSig() != getP()) {
                r = r.getSig();
            }
            r.setSig(w);
            w.setSig(getP());
        }
    }

    void adiultimo(NodoS n) {
        NodoS r;
        if (esvacia()) {
            setP(n);
            getP().setSig(getP());
        } else {
            r = getP();
            while (r.getSig() != getP()) {
                r = r.getSig();
            }
            r.setSig(n);
            n.setSig(getP());
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
        r = getP();
        while (r.getSig() != getP()) {
            System.out.println(" " + r.getDato());
            r = r.getSig();
        }
        System.out.println(" " + r.getDato());

    }

    NodoS eliprimero() {
        NodoS x, r;
        x = getP();
        setP(getP().getSig());
        x.setSig(null);
        r = getP();
        while (r.getSig() != x) {
            r = r.getSig();
        }
        r.setSig(getP());
        return x;

    }

    NodoS eliultimo() {
        NodoS x, r;
        x = r = getP();
        if (r.getSig() == getP()) {
            setP(null);
        } else {
            while (r.getSig() != getP()) {
                x = r;
                r = r.getSig();
            }

        }
        x.setSig(getP());
        x = r;
        return (x);
    }

    void llevafinal() {
        setP(getP().getSig());
    }

    void llevafinal(int k) {
        int i;
        for (i = 1; i <= k; i++) {
            llevafinal();
        }
    }
}
