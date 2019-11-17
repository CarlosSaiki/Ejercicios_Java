package Pila;

public class PrincipalObjetos {

    public static void main(String[] args) {
        PilaPersona A = new PilaPersona();
        PilaPersona B=new PilaPersona();
        Persona a=new Persona("Carlos", "Cartagena");
        Persona b=new Persona("Bismar", "Lima");
        Persona c=new Persona("Danna", "Condori");
        Persona d=new Persona("Carlos", "Maisman");
        System.out.println("Pila A");
        A.adicionar(a);
        A.adicionar(b);
        A.adicionar(c);
        A.adicionar(d);
        A.mostrar();
        System.out.println("Pila B");
        B.adicionar(a);
        B.adicionar(b);
        B.adicionar(c);
        B.adicionar(d);
        B.mostrar();
        
        
    }
}
