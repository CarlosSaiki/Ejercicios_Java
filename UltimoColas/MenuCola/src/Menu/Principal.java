package Menu;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Cola A = new Cola();
        int opcionMenu;
        int buscar;

        do {
            System.out.println("\n |-------------------------------------|");
            System.out.println(" |         ° CONCEPTO DE COLA °        |");
            System.out.println(" |------------------|------------------|");
            System.out.println(" | 1. Insertar      | 5. Mostrar       |");
            System.out.println(" | 2. Buscar        | 6. Ord Asc       |");
            System.out.println(" | 3. Modificar     | 7. Ord Des       |");
            System.out.println(" | 4. Eliminar      | 8. Salir         |");
            System.out.println(" |------------------|------------------|");
            System.out.print(" Escoja una Opción: ");
            opcionMenu = Teclado.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n\n INSERTAR EN LA COLA \n");
                    A.llenar(1);
                    System.out.println("EL NUMERO HA SIDO INGRESADO");
                    break;
                case 2:
                    System.out.println("\n\n BUSCAR EN LA COLA \n");
                    buscar = Leer.datoInt();
                    A.igualar(A, buscar);

                    break;
                case 3:
                    System.out.println("\n\n MODIFICAR DATOS DE LA COLA \n");
                    buscar = Leer.datoInt();
                    A.modificar(A, buscar);
                    System.out.println("LOS NUMEROS HAN SIDO MODIFICADOS");
                    break;
                case 4:
                    System.out.println("\n\n ELIMINAR DATOS DE LA COLA \n");
                    buscar = Leer.datoInt();
                    A.eliminarcola(A, buscar);
                    System.out.println("EL NUMERO HA SIDO ELIMINADO");

                    break;
                case 5:
                    System.out.println("\n\n MOSTRAR LA COLA \n");
                    A.mostrar();
                    break;
                case 6:
                    System.out.println("\n\n ORDENAR ASCENDENTEMENTE LA COLA \n");
                    A.ordenarmen(A);
                    System.out.println("LA COLA HA SIDO ORDENADA");
                    break;
                case 7:
                    System.out.println("\n\n ORDENAR DESCENDENTEMENTE LA COLA \n");
                    A.ordenarmay(A);
                    System.out.println("LA COLA HA SIDO ORDENADA");
                    break;
                case 8:
                    System.out.println("\n\n SALIR \n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n OPCION NO VALIDA \n");
                    break;
            }
        } while (opcionMenu != 8);
    }
}
