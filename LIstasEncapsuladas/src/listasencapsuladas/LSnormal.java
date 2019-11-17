package listasencapsuladas;

public class LSnormal extends ListaSimple {

    public LSnormal() {
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
        w.setDato(d);
        w.setSig(getP());
        setP(w);
    }

    void adiprimero(NodoS n) {
        n.setSig(getP());;
        setP(n);
    }

    void adiultimo(int d) {
        NodoS w = new NodoS();
        NodoS r;
        w.setDato(d);
        if (!esvacia()) {
            setP(w);
        } else {
            r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(w);
        }
    }

    void adiultimo(NodoS n) {
        NodoS r;
        if (!esvacia()) {
            setP(n);
        } else {
            r = getP();
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(n);
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
        while (r != null) {
            System.out.println(" " + r.getDato());
            r = r.getSig();
        }
    }

    NodoS eliprimero() {
        NodoS x;
        x = getP();
        setP(getP().getSig());
        x.setSig(null);
        return x;

    }

    NodoS eliultimo() {
        NodoS x, r;
        x = r = getP();
        if (r.getSig() == null) {
            setP(null);
        } else {
            while (r.getSig() != null) {
                x = r;
                r = r.getSig();
            }

        }
        x.setSig(null);
        x = r;
        return (x);
    }

    void llevafinal() {
        NodoS x, r;
        r = getP().getSig();
        x = getP();
        setP(r);

        while (r.getSig() != null) {
            r = r.getSig();
        }
        r.setSig(x);
        x.setSig(null);
    }

}
