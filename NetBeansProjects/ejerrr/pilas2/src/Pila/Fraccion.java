package Pila;

import java.util.Scanner;

public class Fraccion {
    private int num, den;
    Scanner leer = new Scanner(System.in);

    public Fraccion() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    public void leer(){
        int num=Leer.datoInt();
        int den=Leer.datoInt();
        this.num=num;
        this.den=den;
        
    }
    public void mostrar(){
        System.out.println(num+"/"+den);
    }
}
