package listasencapsuladas;

public class ListasEncapsuladas {

    public static void main(String[] args) {
        LSnormal A=new LSnormal();
        A.leer1(Leer.datoInt());
        A.mostrar();
        LScircular B=new LScircular();
        B.leer2(Leer.datoInt());
        B.mostrar();
    }

}
