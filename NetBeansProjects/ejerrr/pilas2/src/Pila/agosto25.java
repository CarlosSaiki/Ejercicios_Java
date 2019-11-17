package Pila;


import java.util.Scanner;

public class agosto25 {
    public static void main(String[] args) {
    PilaI pila=new PilaI();
    Scanner leer=new Scanner(System.in);
    int n=leer.nextInt();
    pila.llenar(n);
    pila.mostrar();
    }
        
    


}
