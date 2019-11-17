package suma;

import java.util.Scanner;

public class sumagetyset {

    private int a;
    private int b;
    private int c;
    private int suma = 0;
    private int resta=0;
    private int multiplicacion=0;

    public sumagetyset() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void preguntaa(String as) {
        int temporal;
        Scanner leer =new Scanner(System.in); 
        System.out.println(" "+as);
        temporal=leer.nextInt();
        this.setA(temporal);

    }
    public void preguntab(String as) {
        int temporal;
        Scanner leer =new Scanner(System.in); 
        System.out.println(" "+as);
        temporal=leer.nextInt();
        this.setB(temporal);

    }
    public void preguntac(String as) {
        int temporal;
        Scanner leer =new Scanner(System.in); 
        System.out.println(" "+as);
        temporal=leer.nextInt();
        this.setC(temporal);

    }
    public void preguntatodo(){
        this.preguntaa("Introduzca un valor para a: ");
        this.preguntab("Introduzca un valor para b: ");
        this.preguntac("Introduzca un valor para c: ");
    }

    public void suma() {

        suma = getA() + getB() + getC();
        
    }
    public void resta() {

        resta = getA() - getB() - getC();
        
    }
    public void multiplicacion() {

        multiplicacion= getA() * getB() * getC();
        
    }
    
    public void imprimir(){
        suma();
        System.out.println("La suma es: " + suma);
    }
    public void imprimirr(){
        resta();
        System.out.println("La resta es: " + resta);
    }
    public void imprimirm(){
        multiplicacion();
        System.out.println("La multiplicacion es: " + multiplicacion);
    }
    
    
}
