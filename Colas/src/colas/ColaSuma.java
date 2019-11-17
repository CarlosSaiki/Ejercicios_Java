package colas;
public class ColaSuma {
    public static void main(String[] args) {
        Cola A = new Cola();
        System.out.println("Ingrese la dimension de la Cola: ");
        int n = Leer.datoInt();
        System.out.println("Ingrese datos de la Cola: ");
        A.llenar(n);
        A.sumar(A);
    }
}
