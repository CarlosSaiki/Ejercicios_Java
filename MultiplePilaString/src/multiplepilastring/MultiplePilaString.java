package multiplepilastring;

public class MultiplePilaString {

    public static void solucion(MultiplePila a) {
        Pila aux = new Pila();
        for (int i = 1; i < a.getNp(); i++) {
            while (!a.esvacia(i)) {
                aux.adicionar(a.eliminar(i));
            }
                while (!aux.esvacia()) {
                    String c = aux.eliminar();
                    if ((c.charAt(0) == 'a' || c.charAt(0) == 'A') && (c.charAt(c.length() - 1) == 'a' || c.charAt(c.length() - 1) == 'A')) {
                        System.out.println(c);
                    }
                    a.adicionar(i, c);
                }
                
            
        }
    }

    public static void main(String[] args) {
        MultiplePila A = new MultiplePila();
        A.llenar(Leer.datoInt());
        A.mostrar();
        A.mostrar(1);
        A.mostrar(A.getNp());
        solucion(A);

    }

}
