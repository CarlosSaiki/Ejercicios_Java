package colas;
public class TresAri {
    public static void main(String[] args) {
        Cola A = new Cola();
        int n, seri=1, serie2=5;
        System.out.println("Ingrese la dimesion de la cola: ");
        n = Leer.datoInt();
        for (int i = 0; i < n ; i++) {
            if (i % 2 == 0) {
                A.adicionar(seri);
                seri = seri + 2;
            } else {
                A.adicionar(serie2);
                serie2=serie2+2;
            }

        }
        A.mostrar();
        
    }
}
