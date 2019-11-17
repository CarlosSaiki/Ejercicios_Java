package pilas;

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
        int n1, n2,a,b;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la dimension de la primera pila: ");
        n1 = leer.nextInt();
        pila pila = new pila();
        pila pila2 = new pila();
        pila pila3 = new pila();
        do{
        pila.llenar(n1);
        a=pila.eliminar();
        System.out.println(a);
        System.out.println("Ingrese la dimension de la primera pila: ");
        n2 = leer.nextInt();
        pila2.llenar(n2);
        b=pila.eliminar();
        System.out.println(b); 
        
        pila3.adicionar(a);  
        pila3.adicionar(b);
        pila3.mostrar();
            
        }while(pila.esvacia());
        
        
        
        //pila.mostrar();
        //System.out.println("Ingrese la dimension de la segunda pila: ");
        //n2 = leer.nextInt();
        //pila.llenar(n2);
        //pila.mostrar();
        //pila.mostrar();
            
     

    }
}
