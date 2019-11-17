package pilas;
public class ejercicio01{
    public static void main(String[] args) {
        int n=6;
        pila pila=new pila();
        int c=0, a=1, b=0;
        for (int i = 1; i <=n; i++) {
            pila.adicionar(c);
            c=a+b;
            a=b;
            b=c;
            
        }
        pila.mostrar();
        
    }
}
