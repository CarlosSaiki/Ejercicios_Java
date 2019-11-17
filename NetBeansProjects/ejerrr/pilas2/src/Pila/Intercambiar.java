package Pila;

public class Intercambiar {

    public static void intercambio(PilaF a) {
        PilaF b = new PilaF();
        b.vaciar(a);
        while (!b.esvacia()) {
            Fraccion x = b.eliminar();
            int aux = x.getNum();
            x.setNum(x.getDen());
            x.setDen(aux);
            a.adicionar(x);
        }
    }

    public static void intercambiar_elem(PilaF A, PilaF B) {
        PilaF AA = new PilaF();
        PilaF BB = new PilaF();
        AA.vaciar(A);
        BB.vaciar(B);
        A.adicionar(BB.eliminar());
        B.adicionar(AA.eliminar());
        A.vaciar(AA);
        B.vaciar(BB);
    }

    public static void intercambia_Prim_Ult(PilaF A, PilaF B) {
        PilaF AA = new PilaF();
        PilaF BB = new PilaF();
        Fraccion f1 = A.eliminar();
        Fraccion f2 = B.eliminar();
        AA.vaciar(A);
        BB.vaciar(B);
        A.adicionar(f2);
        B.adicionar(f1);
        A.vaciar(AA);
        B.vaciar(BB);
    }

    public static void intercambia_Prim_Ult_2(PilaF A, PilaF B) {
        PilaF aux = new PilaF();
        aux.vaciar(A);
        A.adicionar(B.eliminar());
        A.vaciar(aux);
        aux.vaciar(B);
        B.adicionar(A.eliminar());
        B.vaciar(aux);
    }

    public static void main(String[] args) {
        PilaF A = new PilaF();
        PilaF B = new PilaF();
        A.llenar(Leer.datoInt());
        B.llenar(Leer.datoInt());
        System.out.println("Pila A");
        A.mostrar();
        System.out.println("Pila B");
        B.mostrar();

        intercambio(A);
        A.mostrar();

        intercambiar_elem(A, B);
        A.mostrar();
        B.mostrar();

        intercambia_Prim_Ult(A, B);
        A.mostrar();
        B.mostrar();

        intercambia_Prim_Ult_2(A, B);
        A.mostrar();
        B.mostrar();

    }
}
