package colas;

public class Examen3 {

    public static void main(String[] args) {
        Cola A = new Cola();
        int n, par = 6;
        System.out.println("Ingrese la dimesion de la cola: ");
        n = Leer.datoInt();
        System.out.println("Ingrese el dato a agregar: ");
        int agregar = Leer.datoInt();
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                A.adicionar(par);
                par = par + 2;
            } else {
                A.adicionar(agregar);
            }

        }
        A.mostrar();

    }
}
