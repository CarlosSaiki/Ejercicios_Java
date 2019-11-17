package colas;

public class ColaOrdenar {

    public static void main(String[] args) {
        Cola A = new Cola();
        System.out.println("Ingrese la dimension de la Cola: ");
        int n = Leer.datoInt();
        System.out.println("Ingrese datos de la Cola para ordenarlos Descendentemente: ");
        A.llenar(n);
        ordenarmay(A);
        System.out.println("Ingrese datos de la Cola para ordenarlos Ascendentemente: ");
        A.llenar(n);
        ordenarmen(A);

    }

    public static void ordenarmay(Cola A) {
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
        C.mostrar();
    }

    public static void ordenarmen(Cola A) {
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
        C.mostrar();
    }
}
