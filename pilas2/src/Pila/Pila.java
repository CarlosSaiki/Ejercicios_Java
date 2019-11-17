package Pila;

import java.util.Scanner;

public class Pila {
   private int tope;
    private int max;
    private String []p;

    public Pila() {
        this.tope = 0;
        this.max = 50;
        this.p = new String[this.max] ;
    }
    public boolean esvacia(){
        if(tope!=0)
            return false;
        else
            return true;
    }
    public boolean esllena(){
        if(tope==max-1)
            return true;
        else
            return false;
        
    }
public int nroelementos(){
    return this.tope;
    }
    public void adicionar(String elementos){
     if(!esllena()){
         this.tope++;
         p[this.tope]=elementos;
         
     }else{
         System.out.println("pila llena");
     }   
    
}
    public String eliminar(){
        String elementos="";
        if(!esvacia()){
            elementos=p[this.tope];
            this.tope--;
            return elementos;
            
        }
        else{
            System.out.println("pila es vacia");
            return elementos;
        }
    }
    public void mostrar(){
        String elementos ="";
        if(esvacia()){
            System.out.println("pila vacia");
        }
        else{
            Pila aux=new Pila();
            while(!esvacia()){
                   elementos=eliminar();
                System.out.println(elementos);  
                aux.adicionar(elementos);
                
                    
                           
                    
        }
            while(!aux.esvacia()){
                adicionar(aux.eliminar());
                
            }
    }
    }
    public void llenar (int z){
        Scanner leer=new Scanner(System.in);
        System.out.println("Introducir elementos para pila: ");
        for(int i=1;i<=z;i++)
            adicionar(leer.nextLine());
        
        
    }
    

public void vaciar(Pila A)
{
while(!A.esvacia())
adicionar(A.eliminar());
}
}
