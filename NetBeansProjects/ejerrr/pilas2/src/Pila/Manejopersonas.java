
package Pila;


public class Manejopersonas {
    public static String igual(PilaPersona a,String x){
        String c="";
        Persona aux;
        while(!a.esvacia()){
            aux=a.eliminar();
            if(aux.getNombre().equals(x)){
                c=x+" "+aux.getApellido();
            }
        }
        return c;
    }
    public static void main(String[] args) {
    
    PilaPersona A=new PilaPersona();
    int a=Leer.datoInt();
    A.llenar(a);
    PilaPersona B=new PilaPersona();
    System.out.println("Buscar Nombre ");
        String x = Leer.dato();
        int c = 0;
        Persona aux;
        System.out.println(igual(A, x));
    
    
    }
}
