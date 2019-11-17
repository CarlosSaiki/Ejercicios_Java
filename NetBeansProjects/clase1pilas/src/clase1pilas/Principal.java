package clase1pilas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int n, f = 0, t1 = 1, t2;

        Pila a = new Pila();
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            t2 = f;
            f = t1 + f;
            t1 = t2;

            a.adicionar(t2);

        }
        a.mostrar();
    }
}
