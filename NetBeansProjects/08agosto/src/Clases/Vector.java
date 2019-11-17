package Clases;

import java.util.Scanner;

public class Vector {

    int t, vec[], s, sp, si;
    Scanner leer = new Scanner(System.in);

    public Vector(int t) {
        this.t = t;
        this.vec = new int[t];

    }

    public void llenar() {
        int n1=1;
        for (int i = 0; i < t; i++) {
            vec[i] = n1;
            n1++;
        }
    }
    public void rotar(){
        int n1=1;
        vec[0]=t;
               
        for (int i = 1; i < t; i++) {
            vec[i]=n1;
            n1++;
        }
    }

    public void mostrar() {
        System.out.print("\n Vector Resultante \n v=(");
        for (int i = 0; i < t-1; i++) {
            System.out.print(vec[i]+",");
        }
        System.out.println(vec[t-1]+")");
    }

    public void vectorunitario() {
        for (int i = 0; i < t; i++) {
            if (vec[i] != 1) {
                vec[i] = 1;

            }

        }
        for (int i = 0; i < t; i++) {
            System.out.print(" " + vec[i]);
        }

    }

    public void sumaunnumero() {
        int n;
        n = leer.nextInt();
        for (int i = 0; i < t; i++) {
            vec[i] = vec[i] + n;

        }
        for (int i = 0; i < t; i++) {
            System.out.print(" " + vec[i]);
        }

    }

    public void sumaElementos() {
        for (int i = 0; i < t; i++) {
            s = s + vec[i];
        }
        System.out.println("La suma de los elementos del vector es: " + s);
    }

    public void sumaElementosPares() {
        for (int i = 0; i < t; i++) {
            if (vec[i] % 2 == 0) {
                sp = sp + vec[i];
            }

        }
        System.out.println("La suma de los elementos pares es: " + sp);
    }

    public void sumaElementosImpares() {
        for (int i = 0; i < t; i++) {
            if (vec[i] % 2 == 0) {

            } else {
                si = si + vec[i];
            }

        }
        System.out.println("La suma de los elementos pares es: " + si);
    }

}
