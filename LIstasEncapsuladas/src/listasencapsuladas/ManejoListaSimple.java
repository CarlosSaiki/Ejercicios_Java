package listasencapsuladas;
public class ManejoListaSimple {
    public static void main(String[] args) {
        LSnormal A=new LSnormal();
        int n;
        System.out.println("Ingrese la dimension de la lista: ");
        n=Leer.datoInt();
        A.leer1(n);
        A.mostrar();
        LScircular B=new LScircular();
        B.leer2(n);
        B.mostrar();
    }
}