package colas;
public class DosAri {
    public static void main(String[] args) {
         ColaStrings A = new ColaStrings();
        ColaStrings B = new ColaStrings();
        
        A.adicionar("Jhonatan");
        A.adicionar("Ariel");
        A.adicionar("Roxana");
        System.out.println(" "+A.nroelem());
        System.out.println("Es vacia: "+A.esvacia());
        System.out.println("Ingrese datos en la segunda cola: ");
        B.llenar(3);
        B.vaciar(A);
        System.out.println("Es llena: "+B.esllena());
        System.out.println(" "+B.nroelem());
        B.mostrar();
    }
}
