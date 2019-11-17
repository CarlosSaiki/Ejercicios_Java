package colas;

public class ExamenColas {

    public static void main(String[] args) {
        ColaStrings A = new ColaStrings();
        ColaStrings B = new ColaStrings();
        ColaStrings C = new ColaStrings();
        
        A.adicionar("Carlos");
        A.adicionar("Ariel");
        A.mostrar();
        
        System.out.println("Es vacia: "+A.esvacia());
        
        System.out.println("Llenar datos de golpe: ");
        B.llenar(3);
        System.out.println("Esta llena " + B.esllena());

        B.mostrar();
        C.mostrar();
        C.intercalar(A, B);
        C.mostrar();

    }

}
