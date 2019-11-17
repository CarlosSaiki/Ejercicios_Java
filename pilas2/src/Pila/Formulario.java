package Pila;

public class Formulario {
    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del formulario: ");
        int x;
        x = Leer.datoInt();
            
            while (x != 6) {
                
                PilaFruta fruta = new PilaFruta();
                System.out.println("1. Insertar: ");
                
                if (x == 1) {
                    fruta.llenar(1);
                    System.out.println("Ingrese un numero del formulario: ");
                    x=Leer.datoInt();
                    
                } else if (x == 2) {
                    PilaFruta A = new PilaFruta();
                    System.out.println("2. Buscar: ");
                    
                    System.out.println("Ingrese el nombre de la fruta a buscar:");
                    String n = Leer.dato();
                    System.out.println(igualar(A, n));
                    System.out.println("Ingrese un numero del formulario: ");
                    x=Leer.datoInt();
                    
                } else if (x == 3) {
                    System.out.println("3. Modificar: ");
                    System.out.println("Ingrese un numero del formulario: ");
                    x=Leer.datoInt();
                    
                } else if (x == 4) {
                    System.out.println("4. Eliminar: ");
                    
                    fruta.eliminar();
                    System.out.println("Ingrese un numero del formulario: ");
                    x=Leer.datoInt();
                    
                } else if (x == 5) {
                    System.out.println("5. Mostrar: ");
                    
                    fruta.mostrar();
                    System.out.println("Ingrese un numero del formulario: ");
                    x=Leer.datoInt();
                    
                } else if (x == 6) {
                    System.out.println("6. Salir: ");
                    
                    System.exit(0);
                    
                }
            }
            
        
    }
    
    public static String igualar(PilaFruta z, String x) {
        Frutas aux;
        
        while (!z.esvacia()) {
            aux = z.eliminar();
            if (aux.getNombre().equals(x)) {
                System.out.println(x + " " + aux.getColor() + " " + aux.getMaduracion() + " " + aux.getTamaño());
            }
        }
        return " ";
    }
}
