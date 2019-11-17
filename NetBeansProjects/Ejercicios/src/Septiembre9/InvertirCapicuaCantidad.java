package Septiembre9;

import java.util.Scanner;

public class InvertirCapicuaCantidad {

    private int a;
    private int cubo;
    private int mul;
    private int inv;
    private int cont;
    private int contprim;
    private int cap;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void preguntaa(String as) {
        int temporal;
        Scanner lectura = new Scanner(System.in);
        do {
            System.out.println(" " + as);
            temporal = lectura.nextInt();
            this.setA(temporal);
        } while (temporal <= 9);
    }

    public void preguntaTodo() {
        this.preguntaa("Introduzca un numero mayor a 10");
    }

    public void cubo() {
        cubo = getA() * getA() * getA();
    }

    public void multiplo() {
        if (getA() % 7 == 0) {
            System.out.println("El Numero es multiplo de 7");
        } else {
            System.out.println("El Numero no es multiplo de 7");
        }
    }

    public void factorial() {
        int b = 1;
        for (int i = 1; i <= getA(); i++) {
            b = b * i;
        }
        mul = b;

    }

    public void contar() {
        int n1 = getA(), c = 0;
        while (n1 != 0) {
            n1 = n1 / 10;
            c++;
        }
        cont = c;
    }

    public void invertir() {
        int n2 = getA(), nu = 0, d;
        while (n2 > 0) {
            d = n2 % 10;
            n2 = (n2 / 10);
            nu = nu * 10 + d;
        }
        inv = nu;
    }

    public void Primos() {
        int cn = getA(), res;
        int dig, contadorPrimos = 0;
        while (cn > 0) {
            dig = cn % 10;
            res = esPrimo(dig);
            if (res == 1) {
                contadorPrimos++;
            }
            cn = cn / 10;
        }
        contprim = contadorPrimos;
    }

    public static int esPrimo(int x) {
        int sw;
        int contador, i;
        contador = 0;
        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            sw = 1;
        } else {
            sw = 0;
        }
        return sw;
    }

    public void capicua() {
        if (getA() == inv) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
    }

    public void imprimir() {
        invertir();
        System.out.println("El numero invertido es: " + inv);
        capicua();
        Primos();
        System.out.println("El numero tiene " + contprim + " digitos primos");

    }

}
