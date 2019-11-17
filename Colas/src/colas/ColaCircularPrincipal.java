package colas;

public class ColaCircularPrincipal {

    public static void intercalar(ColaCircular a, ColaCircular b) {
        ColaCircular c = new ColaCircular();
        
        while (!a.esvacia() && !b.esvacia()) {
            c.adicionar(a.eliminar());
            c.adicionar(b.eliminar());
        }
        if (!a.esvacia()) {
            c.vaciar(a);
        } else {
            c.vaciar(b);
        }
        c.mostrar();

    }

    public static void ordena(ColaCircular a) {
        ColaCircular aux = new ColaCircular();
        ColaCircular aux2 = new ColaCircular();
        Fraccion men, x;

        while (!a.esvacia()) {
            men = a.eliminar();
            while (!a.esvacia()) {
                x = a.eliminar();
                if (x.getDen() < men.getDen()) {
                    aux.adicionar(men);
                    men = x;
                } else {
                    aux.adicionar(x);
                }
            }
            aux2.adicionar(men);
            a.vaciar(aux);

        }
        a.vaciar(aux2);
        a.mostrar();

    }
    public static void elimina(ColaCircular a) {
        ColaCircular aux = new ColaCircular();
        ColaCircular aux2 = new ColaCircular();
        Fraccion men, x;

        while (!a.esvacia()) {
            men = a.eliminar();
            while (!a.esvacia()) {
                x = a.eliminar();
                if (!(x.Igual(men))) {
                    aux.adicionar(x);
                }
            }
            aux2.adicionar(men);
            a.vaciar(aux);

        }
        a.vaciar(aux2);
        a.mostrar();

    }
    public static void agrupar(ColaCircular a) {
        ColaCircular aux = new ColaCircular();
        ColaCircular aux2 = new ColaCircular();
        Fraccion men, x;

        while (!a.esvacia()) {
            men = a.eliminar();
            while (!a.esvacia()) {
                x = a.eliminar();
                if (x.getNum()< men.getNum()) {
                    aux.adicionar(x);
                } else {
                    aux2.adicionar(x);
                }
            }
            aux.adicionar(men);
            a.vaciar(aux2);

        }
        a.vaciar(aux);
        a.mostrar();

    }
    public static void main(String[] args) {
        ColaCircular A=new ColaCircular();
        ColaCircular B=new ColaCircular();
        A.llenar(5);
        A.mostrar();
        B.llenar(4);
        B.mostrar();
        ordena(A);
        A.mostrar();
    }
    
}
