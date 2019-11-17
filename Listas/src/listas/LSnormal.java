package listas;

public class LSnormal extends ListaSimple {

    public LSnormal() {
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
        w.dato = d;
        w.sig = p;
        p = w;
    }

    void adiprimero(NodoS n) {
        n.sig = p;
        p = n;
    }

    void adiultimo(int d) {
        NodoS w = new NodoS();
        NodoS r;
        w.dato = d;
        if (!esvacia()) {
            p = w;
        } else {
            r = p;
            while (r.sig != null) {
                r = r.sig;
            }
        }
    }

    void adiultimo(NodoS n) {
        NodoS r;
        if (!esvacia()) {
            p = n;
        } else {
            r = p;
            while (r.sig != null) {
                r = r.sig;
            }
            r.sig = n;
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
        while (r != null) {
            System.out.println(" " + r.dato);
            r = r.sig;
        }
    }

    NodoS eliprimero() {
        NodoS x;
        x = p;
        p = p.sig;
        p.sig = null;
        return x;

    }

    NodoS eliultimo() {
        NodoS x, r;
        x = r = p;
        if (r.sig == null) {
            p = null;
        } else {
            while (r.sig != null) {
                x = r;
                r = r.sig;
            }

        }
        x.sig = null;
        x = r;
        return (x);
    }
    void llevafinal(){
        NodoS x,r;
        r=p.sig;
        x=p;
        p=r;
        while(r.sig!=null){
            r=r.sig;
        }
        r.sig=x;
        x.sig=null;
    }

}
