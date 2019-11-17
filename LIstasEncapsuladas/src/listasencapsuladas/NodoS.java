package listasencapsuladas;

public class NodoS {

    private int dato;

    private NodoS Sig;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoS getSig() {
        return Sig;
    }

    public void setSig(NodoS sig) {
        Sig = sig;
    }

}
