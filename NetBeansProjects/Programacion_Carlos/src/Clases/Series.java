package Clases;

public class Series {

    int n, s, n1 = 1, n2;

    public Series(int n) {
        this.n = n;
    }

    public void llenar() {
        if (n % 2 == 0) {
            for (int i = 1; i <= n / 2; i++) {
                s = (int) (s + i + Math.pow(i, 2));
            }
        } else {
            for (int i = 1; i <= n / 2; i++) {
                s = (int) (s + i + Math.pow(i, 2));
            }
            n = n / 2 + 1;
            s = s + n;
        }
    }

    public void llenar2() {
        for (int i = 1; i <= n; i++) {
            s = s + n1;
            n1 = n1 * 10;
        }
    }

    public void llenar3() {
        int a = 2, d = 1, temp;
        temp = a + d;
        s = s + temp;
        for (int i = 3; i <= n; i++) {
            s = s + temp;
            a = d;
            d = temp;
            temp = a + d;

        }
    }

    

    public void mostrar() {
        System.out.println("La suma de la series es: " + s);
    }

}
