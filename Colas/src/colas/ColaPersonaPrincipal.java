package colas;

public class ColaPersonaPrincipal {

    public static void verificar(ColaPersona A, int i) {
        ColaPersona aux = new ColaPersona();
        int n = A.nroelem();
        for (int j = 1; j <= n; j++) {
            Persona x = A.eliminar();
            aux.adicionar(x);
            if (j == i) {
                if (x.getEdad() < 12) {
                    System.out.println("La Persona es niño.");
                } else {
                    System.out.println("La Persona no es niño");
                }
            }
        }
        A.vaciar(aux);

    }

    public static void mayorEdad(ColaPersona A) {
        int mayor = 0;
        ColaPersona aux = new ColaPersona();
        while (!A.esvacia()) {
            Persona x = A.eliminar();
            if (x.getEdad() > mayor) {
                mayor = x.getEdad();
            }
            aux.adicionar(x);
        }
        while (!aux.esvacia()) {
            Persona x = aux.eliminar();
            if (x.getEdad() == mayor) {
                x.mostrar();
            }
            A.adicionar(x);
        }

    }

    public static void mostrarPersonas(ColaPersona A, ColaPersona B) {
        ColaPersona AA = new ColaPersona();
        ColaPersona BB = new ColaPersona();
        while (!A.esvacia()) {
            Persona elem = A.eliminar();
            AA.adicionar(elem);
            while (!B.esvacia()) {
                Persona elem2 = B.eliminar();
                BB.adicionar(elem2);

                if (elem.getEdad() == elem2.getEdad() && elem.getNombre().equals(elem2.getNombre())) {
                    System.out.println(elem.getNombre() + " Edad " + elem.getEdad());
                }

            }
        }
        A.vaciar(AA);
        B.vaciar(BB);
    }

    public static void main(String[] args) {
        
        ColaPersona A = new ColaPersona();
        System.out.println("Ingrese la cantidad de personas a comparar: ");
        A.llenar(Leer.datoInt());
        System.out.println("Ingrese el numero de persona, para saber si es niño: ");
        int i = Leer.datoInt();
        verificar(A, i);

        ColaPersona B = new ColaPersona();
        System.out.println("Ingrese la cantidad de personas para saber cual de todos es el que tiene mas  edad: ");
        B.llenar(Leer.datoInt());
        mayorEdad(B);

        ColaPersona E = new ColaPersona();
        System.out.println("Ingrese la cantidad de Personas a igualar en la cola F: ");
        E.llenar(Leer.datoInt());
        ColaPersona F = new ColaPersona();
        System.out.println("Ingrese la cantidad de Personas a igualar en la cola E: ");
        F.llenar(Leer.datoInt());
        mostrarPersonas(E, F);
    }
}
