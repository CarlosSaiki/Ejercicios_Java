package Pila;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        
        PilaFruta fruta = new PilaFruta();
        int x; String buscar;
        JOptionPane.showMessageDialog(null, "Bienvenido señor usuario a este menu: ");
        JOptionPane.showMessageDialog(null, "Espero sea de tu agrado ");
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja, una de las siguientes opciones: \n1. Insertar \n2. Buscar \n3. Modificar \n4. Eliminar \n5. Mostrar \n6. Salir"));
            switch (x) {
                
                case 1:
                    fruta.llenar(1);
                    JOptionPane.showMessageDialog(null, "La fruta ha sido ingresada :) ");
                    break;
                case 2:
                    buscar =JOptionPane.showInputDialog("Ecriba el nombre de la fruta a buscar: ");
                    fruta.igualar(fruta, buscar);
                    break;
                case 3:
                    buscar =JOptionPane.showInputDialog("Ecriba el nombre de la fruta a modificar: ");
                    fruta.modificar(fruta, buscar);
                    break;
                case 4:
                    buscar =JOptionPane.showInputDialog("Ecriba el nombre de la fruta a eliminar: ");
                    fruta.eliminarfruta(fruta, buscar);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "La pila nos queda de la siguiente manera:  ");
                    fruta.mostrar();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Muchas gracias hasta luego: ");
                    System.exit(0);
                    break;
            }

        } while (x != 6);
    }
}
