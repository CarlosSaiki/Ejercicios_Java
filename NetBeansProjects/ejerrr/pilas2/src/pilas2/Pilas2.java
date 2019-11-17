
package pilas2;

import java.util.Scanner;


public class Pilas2 {

    
    public static void main(String[] args) {
      Scanner leer =new Scanner(System.in);
       int r=leer.nextInt();
       cambiar pila=new cambiar();
       pila .llenar(r);
       pila.mostrar();
        Scanner lee =new Scanner(System.in);
       int s=lee.nextInt();
       cambiar pila1=new cambiar();
       pila1.llenar(s);
       pila1.mostrar();
        cambiar pilac=new cambiar();
        while (!pila.esvacia()&& !pila1.esvacia()) {
           pilac.adicionar(pila.eliminar());
           pilac.adicionar(pila1.eliminar());
           
            
            
        }
        if (!pila.esvacia()) {
            while (!pila.esvacia()) 
pilac.adicionar(pila.eliminar());

        }else{ 
            while (!pila1.esvacia())                 
                pilac.adicionar(pila1.eliminar());
                pilac.mostrar();
            
 
        }
        
        }
}
