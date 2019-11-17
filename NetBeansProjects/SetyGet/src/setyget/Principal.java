package setyget;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String a;
        SetyGet estudiante1 = new SetyGet();
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el nombre del estudiante ");
        a = leer.nextLine();
        estudiante1.setNombre(a);
        System.out.println("Introduzca el apellido del estudiante ");
        a = leer.nextLine();
        estudiante1.setApellido(a);
        System.out.println("Introduzca el correo electronico del estudiante ");
        a = leer.nextLine();
        estudiante1.setCorreo(a);
        System.out.println("Esto es diferente: ");
        estudiante1.mostrartodo();
    }

}
