package a001;

import java.util.Scanner;

public class perprimul {

    private int a;
    private int inv;
    private int cap;
    private int pri;
    private int per;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void entvalor() {
        int b;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero mayor a 10: ");
            b = leer.nextInt();
        } while (b < 10);
        setA(b);
    }

    public int invertir() {
        int seg = getA(), x, y = 0;
        while (seg > 0) {
            x = seg % 10;
            y = (y * 10) + x;
            seg = seg / 10;
        }
        inv = y;
        return inv;
    }

    public void capicua() {
        if (getA() == invertir()) {
            System.out.println(getA() + " Es número capicua");
        } else {
            System.out.println(getA() + " No es número capicua");
        }
    }

    public int primos() {
        int seg = inv(getA()), x, dig = 0, cont = 0, b = 0;
        while (seg > 0) {
            x = seg % 10;
            seg = seg / 10;
            cont = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {

            } else {
                b = (b * 10) + x;
            }
        }

        pri = b;
        return pri;
    }

    public int inv(int z) {
        int seg = z, x, y = 0;
        while (seg > 0) {
            x = seg % 10;
            y = (y * 10) + x;
            seg = seg / 10;
        }
        inv = y;
        return inv;
    }

    public void mult() {

        int seg = getA(), x, cont = 0;
        while (seg > 0) {
            x = seg % 10;
            seg = seg / 10;

            if (x % 2 == 0) {
                if (x != 0) {
                    cont++;
                }
            }
        }
        System.out.println("La cantidad de digitos multiplos de 2 es: " + cont);

    }

    public void perf() {
        int seg = getA(), s = 0;
        for (int i = 1; i < seg; i++) {
            if (seg % i == 0) {
                s = s + i;
            }
        }
        if (s == seg) {
            System.out.println("El numero "+seg+ " es perfecto");
        } else {
            System.out.println("El numero " + seg + " no es perfecto");
        }
    }

    public void mostar() {

        entvalor();
        System.out.println("El numero sin digitos primos es: " + this.primos());
        mult();
        perf();

    }
}
