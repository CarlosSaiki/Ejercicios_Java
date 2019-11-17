package multiplepilaevaluaciones;

public class MultiplePilaEvaluaciones {
    
    public static void NotaTotal(MultiplePilaEv A, String x) {
        PilaEv aux = new PilaEv();
        int nota = 0;
        for (int i = 1; i <= A.getN(); i++) {
            while (!A.esvacia(i)) {
                Evaluacion z = A.eliminar(i);
                if (z.getNom().equals(x)) {
                    nota = nota + z.getNota();
                }
                aux.adicionar(z);
            }
            A.vaciar(i, aux);
        }
        System.out.println("Nota Total -->" + nota);
    }
    
    public static void verificar(MultiplePilaEv A, String x) {
        PilaEv aux = new PilaEv();
        int cont = 0;
        for (int i = 1; i <= A.getN(); i++) {
            while (!A.esvacia(i)) {
                Evaluacion e = A.eliminar(i);
                if (e.getNom().equals(x)) {
                    cont++;
                }
                aux.adicionar(e);
            }
            A.vaciar(i, aux);
        }
        if (cont == A.getN()) {
            System.out.println("El estudiante tiene evaluaciones en todas las defensas");
        } else {
            System.out.println("El estudiante NO tiene evaluaciones en todas las defensas");
        }
    }

    public static void mayor(MultiplePilaEv A) {
        int may = 0;
        PilaEv aux = new PilaEv();
        for (int i = 1; i < A.getN(); i++) {
            System.out.println("Defensa " + i + " ");
            while (A.esvacia(i)) {
                Evaluacion e = A.eliminar(i);
                if (may > e.getNota()) {
                    may = e.getNota();
                }
                aux.adicionar(e);
            }
            while (!aux.esvacia()) {
                Evaluacion e = A.eliminar(i);
                if (e.getNota() == may) {
                    System.out.println(e.getNom() + " " + e.getNota());
                }
            }
            may = 0;
            A.vaciar(i, aux);
        }
    }
    
    public static void main(String[] args) {
    MultiplePilaEv A=new MultiplePilaEv();
        System.out.println("Ingrese la dimension de las pilas: ");
    A.llenar(Leer.datoInt());
        NotaTotal(A, Leer.dato());
        verificar(A, Leer.dato());
        mayor(A);
    }
    
}
