package Septiembre9;

import java.util.Scanner;

public class CuboFactorialMultiplo {

    private int a;
    private int cubo;
    private int mul;
    private int d;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void preguntaa(String as) {
        int temporal;
        Scanner lectura = new Scanner(System.in);
        System.out.println(" " + as);
        temporal = lectura.nextInt();
        this.setA(temporal);
    }

    public void preguntaTodo() {
        this.preguntaa("Introduzca un digito");
    }

    public void cubo() {
        cubo = getA() * getA() * getA();
    }

    public void multiplo() {
        if (getA()%4==0) {
            System.out.println("El numero es multiplo de 4");
        } else {
            System.out.println("El numero no es multiplo de 4");
        }
    }

      public void factorial(){
        int b = 1;
        for(int i = 1 ; i <= getA() ; i++){
            b = b * i;
        }
        mul = b;
          
    }

    public void imprimir() {
        cubo();
        System.out.println("El resultado es " + cubo);
        factorial();
        System.out.println("El factorial es " + mul );
                
    }

}
