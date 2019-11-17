
package Pila;

public class Frutas {
    private String color,tipo,tamaño,madurez;

    public Frutas() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMadurez() {
        return madurez;
    }

    public void setMadurez(String madurez) {
        this.madurez = madurez;
    }
    public void leer(){
        System.out.println("Ingrese color de la fruta");
        color=Leer.dato();
        System.out.println("Ingrese tipo de la fruta");
        tipo=Leer.dato();
        System.out.println("Ingrese tamaño de la fruta");
        tamaño=Leer.dato();
        System.out.println("Ingrese madurez de la fruta");
        madurez=Leer.dato();
    }
    public void mostrar(){
         System.out.println("el color de la fruta es: "+color);
         System.out.println("el tipo de la fruta es: "+tipo);
         System.out.println("el tamaño de la fruta es: "+tamaño);
         System.out.println("la madurez de la fruta es: "+madurez);
         System.out.println("");
    }
}
