package multiplepilaenteros;

public class MultiplePilaEnteros {

    public static void main(String[] args) {
        MultiplePila A = new MultiplePila();
        System.out.println("Ingrese la cantidad de pilas a llenar: ");
        A.llenar(Leer.datoInt());
        A.mostrar();
    }

}
