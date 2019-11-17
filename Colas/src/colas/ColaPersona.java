package colas;
public class ColaPersona {
       private int max;
    private int ini, fin;
    private Persona v[];

    public ColaPersona() {
        max = 50;
        ini = fin = 0;
        v = new Persona[max];
    }

    public boolean esvacia() {
        if (ini == 0 && fin == 0) {
            return (true);
        }
        return (false);
    }

    public boolean esllena() {
        if (fin == max - 1) {
            return (true);
        }
        return (false);
    }

    public int nroelem() {
        return (fin - ini);
    }

    public void adicionar(Persona elem) {
        if (!esllena()) {
            fin++;
            v[fin] = elem;

        } else {
            System.out.println("Cola Persona llena");

        }
    }

    public Persona eliminar() {
        Persona elem =new Persona();
        if (!esvacia()) {
            ini++;
            elem = v[ini];
            if (ini == fin) {
                ini = fin = 0;
            }

        } else {
            System.out.println("Cola Persona vacia");
        }
        return elem;
    }
    public void mostrar(){
        Persona elem;
        if(esvacia()){
            System.out.println("Cola Persona vacia");
        }else{
            System.out.println("\n Datos de la Cola");
            ColaPersona aux=new ColaPersona();
            while (!esvacia()){
                elem=eliminar();
                aux.adicionar(elem);
                elem.mostrar();
                
            }
            while(!aux.esvacia()){
                elem=aux.eliminar();
                adicionar(elem);
            }
        }
    }
    public void llenar(int n){
        int i;
        for (i=1;i<=n;i++) {
            Persona z=new Persona();
            z.leer();
            adicionar(z);
        }
    }
    public void vaciar(ColaPersona a){
        while (!a.esvacia()){
            adicionar(a.eliminar());
            
        }
    }
}
