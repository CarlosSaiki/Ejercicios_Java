package multiplepila;

public class ManejoPilaMultiple {
    public static void Revisar(MultiplePila Z, String x){
        Cancion y;
        Pila aux=new Pila();
        for (int k = 1; k <=Z.getNp(); k++) {
            int r=Z.nroelementos(k);
            for (int j = 1; j <=r; j++) {
                y=Z.eliminar(k);
                aux.adicionar(y);
                if(y.getCantante().equals(x))
                    System.out.println(y.getTitulo());
            }
        }
    }

    public static void main(String[] args) {
        MultiplePila A = new MultiplePila();
        A.llenar(Leer.datoInt());
        A.mostrar();
        Revisar(A, Leer.dato());
    }
}
