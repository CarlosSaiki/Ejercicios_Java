package clase1pilas;
public class Clase1pilas {
    public static void main(String[] args) {
       Pila a = new Pila();
       /*a.adicionar(3);
       a.adicionar(2);
       a.adicionar(6);
       a.mostrar();
       
        /*System.out.println("---------------");
        a.llenar(3);
        System.out.println("---------------");
        a.mostrar();*/
        
        //llenar una pila con n elementos de la serie fibonacci
        //llenar una pila con n elementos de numeros consecutivos
        Pila b = new Pila();
        int n =10;
        
        for (int i = 1; i <= n; i++) {
        b.adicionar(i);
        }
        b.mostrar();
    }
}
