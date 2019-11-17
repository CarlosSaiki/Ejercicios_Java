package Pila;

import java.util.Scanner;

public class ManejoPilas {

    public static int contar(PilaC z,String x){
        int c=0;
        Caja aux;
        while(!z.esvacia()){
            aux=z.eliminar();
            if(aux.getColor().equals(x)){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PilaC A = new PilaC();
        A.llenar(4);
        A.mostrar();
        System.out.println("Ingrese el color de la pila a contar: ");
        String x = Leer.dato();
        int c = 0;
        Caja aux;
        /*while (!A.esvacia()) {
            aux = A.eliminar();
            if (aux.getColor().equals(x)) {
                c++;
            }
        }
        System.out.println("Existe " + c + " cajas de color " + x);*/
        System.out.println(contar(A, x));

    }
}
