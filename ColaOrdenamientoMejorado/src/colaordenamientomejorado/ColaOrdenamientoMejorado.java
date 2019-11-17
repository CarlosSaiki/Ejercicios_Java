package colaordenamientomejorado;
public class ColaOrdenamientoMejorado {
    public static void main(String[] args) {
        Cola A = new Cola();
        System.out.println("Ingrese la dimension de la Cola: ");
        int n = Leer.datoInt();
        System.out.println("Ingrese datos de la Cola para ordenarlos Ascendentemente: ");
        A.llenar(n);
        A.ordenar(A);
        A.mostrar();
        
    }
    
}
