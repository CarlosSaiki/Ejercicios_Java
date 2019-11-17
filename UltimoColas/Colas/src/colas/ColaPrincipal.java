package colas;

public class ColaPrincipal {
    
    
    
    public static void main(String[] args) {
        Cola A = new Cola();
        System.out.println("Ingrese la Dimension de la Cola A");
        int a=Leer.datoInt();
        A.llenar(a);
        A.mostrar();
        Cola B = new Cola();
        System.out.println("Ingrese la Dimension de la Cola B");
        int b=Leer.datoInt();
        B.llenar(b);
        B.mostrar();
        Cola C=new Cola();
        C.intercalar(A, B);
    }
}
