package Pila;

import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la primera pila: ");
        int r = leer.nextInt();
        PilaI pila2 = new PilaI();
        int pa=2, im=1;
        for (int i = 0; i < r; i++) {
            pila2.adicionar(im);
            im=im+2;
        }
        pila2.mostrar();
        System.out.println("Ingrese la dimension de la segunda pila: ");
        int s = leer.nextInt();
         PilaI pila = new PilaI();
        
        for (int i = 0; i < s; i++) {
            pila.adicionar(pa);
            pa=pa+2;
            
        }
        pila.mostrar();

        
        /*System.out.println("Ingrese la dimension de la segunda pila: ");
        Scanner lee = new Scanner(System.in);
        int s = lee.nextInt();
        Pila pila1 = new Pila();
        pila1.llenar(s);
        pila1.mostrar();
        Pila pilac = new Pila();
        while (!pila.esvacia() && !pila1.esvacia()) {
            pilac.adicionar(pila.eliminar());
            pilac.adicionar(pila1.eliminar());
        }
        if (!pila.esvacia()) {
            while (!pila.esvacia()) {
                pilac.adicionar(pila.eliminar());
            }

        } else {
            while (!pila1.esvacia()) {
                pilac.adicionar(pila1.eliminar());
            }
            System.out.println("Entonces  combinando la pila nos queda como: ");
            pilac.mostrar();
        }*/
    }
}
