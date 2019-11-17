package Pila;

public class Principal2 {

    public static String igualar(PilaPersona z, String x) {
        Persona aux;

        while (!z.esvacia()) {
            aux = z.eliminar();
            if (aux.getNombre().equals(x)) {
                System.out.println(x+" "+aux.getApellido());
            }
        }
        return " ";
    }

    public static void main(String[] args) {

        PilaPersona A = new PilaPersona();

        System.out.println("Ingrese la cantidad de personas para la pila");
        int x = Leer.datoInt();
        A.llenar(x);
        System.out.println("Ingrese el nombre a buscar en la pila");
        String n = Leer.dato();
        Persona aux;

        System.out.println(igualar(A, n));

    }
}
