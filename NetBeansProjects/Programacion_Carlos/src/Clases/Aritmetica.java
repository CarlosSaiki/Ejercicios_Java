package Clases;

import java.util.Scanner;

public class Aritmetica {

    int n1, n2, d, p, di;
    Scanner leer = new Scanner(System.in);

    public Aritmetica(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void Diferencia() {
        d = n1 - n2;
        System.out.println("La diferencia de los numeros es: " + d);
    }

    public void Producto() {
        p = n1 * n2;
        System.out.println("El producto de los numeros es: " + p);
    }

    public void Division() {
        try {
            di = n1 / n2;
            System.out.println("La division de los numeros es: " + di);
        } catch (ArithmeticException ae) {
            System.out.println("El divisor no puede ser cero, ingrese un nuevo divisor: ");
            n2 = leer.nextInt();
            di = n1 / n2;
            System.out.println("La division de los numeros es: " + di);

        }
    }
}
