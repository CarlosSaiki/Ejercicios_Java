package Clases;

public class Suma {

    double n, n1, n2 = 0, s;

    public Suma(int n) {
        this.n = n;
    }

    public void llenar() {
        for (int i = 0; i < n; i++) {
            n1 = Math.pow(3, i);
            n2 = n2 + 2;
            n1 = n1 * 3;
            s = s+n1 / n2;

        }

    }

    public void mostrar() {
        System.out.println("La suma es: " + s);

    }

}
