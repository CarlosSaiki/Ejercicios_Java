
package programacion.explicada;

import java.util.Scanner;

public class Pila {
 
    Scanner teclado = new Scanner(System.in);
    Nodo primero;
    
    public Pila(){
        primero = null;
    }
    
    public void ingresarNodo(){
       Frutas nuevo = new Frutas();
        System.out.print(" Ingrese el dato que contendra el nuevo Nodo: ");
        nuevo.leer();
                        System.out.println("\n Nodo ingresado con exito\n");
    }
    
    public void buscarNodo(){
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.print(" Ingrese el dato del nodo a buscar: ");
        int nodoBuscado = teclado.nextInt();
        if(primero != null && encontrado != true){
            while(actual != null){
                if(actual.dato == nodoBuscado){
                    System.out.println("\n Nodo con el dato " + actual.dato + " Encontrado \n");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if(!encontrado){
                System.out.println("\n Nodo no encontrado\n");
            }
        }else{
            System.out.println("\n La pila se encuentra vacia\n");
        }  
    }
    
    public void modificarNodo(){
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.print(" Ingrese el dato del nodo a Modificar: ");
        int nodoBuscado = teclado.nextInt();
        if(primero != null && encontrado != true){
            while(actual != null){
                if(actual.dato == nodoBuscado){
                    System.out.println("\n Nodo con el dato " + actual.dato + " Encontrado \n");
                    System.out.print("Ingrese el nuevo dato para este nodo: ");
                    actual.dato = teclado.nextInt();
                    System.out.println("\n Nodo modificado\n");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if(!encontrado){
                System.out.println("\n Nodo no encontrado\n");
            }
        }else{
            System.out.println("\n La pila se encuentra vacia\n");
        }  
    }
    
    // 23 -> 34-> 26 -> 7 ->null         56-> 26
    // primero = 23  --  actual = 26  anterior = 56  encontrado = true  nodoBuscado = 56
    
    public void eliminarNodo(){
        Nodo actual = new Nodo();
        actual = primero;
        Nodo anterior = new Nodo();
        anterior = null;
        boolean encontrado = false;
        System.out.print(" Ingrese el dato del nodo a Eliminar: ");
        int nodoBuscado = teclado.nextInt();
        if(primero != null){
            while(actual != null && encontrado != true){
                if(actual.dato == nodoBuscado){
                    if(actual == primero){
                        primero = primero.siguiente;
                    }else{
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("\n Nodo con el dato " + actual.dato + " Eliminado \n");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if(!encontrado){
                System.out.println("\n Nodo no encontrado\n");
            }
        }else{
            System.out.println("\n La pila se encuentra vacia\n");
        }  
    }
    
    public void desplegarPila(){
        Nodo actual = new Nodo();
        actual = primero;
        if(primero != null){
            while(actual != null){
                System.out.println(" " + actual.dato);
                actual = actual.siguiente;
            }   
        }else{
            System.out.println("\n La pila se encuentra vacia\n");
        }
    }
}