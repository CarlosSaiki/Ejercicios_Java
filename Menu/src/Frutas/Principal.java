package Frutas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        PilaFruta fruta = new PilaFruta();
        int opcionMenu;
        String buscar;

        do {
            System.out.println("\n |-------------------------------------|");
            System.out.println(" |         ° CONCEPTO DE PILA °        |");
            System.out.println(" |------------------|------------------|");
            System.out.println(" | 1. Insertar      | 4. Eliminar      |");
            System.out.println(" | 2. Buscar        | 5. Mostrar       |");
            System.out.println(" | 3. Modificar     | 6. Salir         |");
            System.out.println(" |------------------|------------------|");
            System.out.print(" Escoja una Opción: ");
            opcionMenu = Teclado.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n\n INSERTAR EN LA PILA \n");
                    fruta.llenar(1);
                    System.out.println("La fruta ha sido ingresada");
                    break;
                case 2:
                    System.out.println("\n\n BUSCAR EN LA PILA \n");
                    buscar=Leer.dato();
                    fruta.igualar(fruta, buscar);

                    break;
                case 3:
                    System.out.println("\n\n MODIFICAR DATOS DE LA PILA \n");
                    buscar=Leer.dato();
                    fruta.modificar(fruta, buscar);
                    break;
                case 4:
                    System.out.println("\n\n ELIMINAR DATOS DE LA PILA \n");
                    buscar=Leer.dato();
                    fruta.eliminarfruta(fruta, buscar);
                    break;
                case 5:
                    System.out.println("\n\n MOSTRAR LA PILA \n");
                    fruta.mostrar();
                    break;
                case 6:
                    System.out.println("\n\n SALIR \n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n OPCION NO VALIDA \n");
                    break;
            }
        } while (opcionMenu != 6);
    }

}
