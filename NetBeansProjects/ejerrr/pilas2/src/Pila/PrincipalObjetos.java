package Pila;

public class PrincipalObjetos {

    public static void main(String[] args) {
        PilaPersona A = new PilaPersona();
        PilaPersona B = new PilaPersona();
        System.out.println("Pila A");
        Persona a=new Persona("Bismart", "Lima");
        Persona b=new Persona("Zenteno", "Alarico");
        Persona c=new Persona("Carlos", "Cartagena");
        Persona d=new Persona("Jhony", "Chavez");
        A.adicionar(a);
        A.adicionar(b);
        A.adicionar(c);
        A.adicionar(d);
        A.mostrar();
        System.out.println("Pla B");
        B.adicionar(a);
        B.adicionar(b);
        B.adicionar(c);
        B.adicionar(d);
        B.mostrar();
    }
}
