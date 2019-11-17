package Pila;
public class PrincipalFrutas {
    public static void main(String[] args) {
        PilaFruta fruta=new PilaFruta();
        System.out.println("Ingrese la Cantidad de Frutas: ");
        int f=Leer.datoInt();
        fruta.llenar(f);
        fruta.mostrar();
    }
}
