package Clases;

import Grafica.ventana;
import javax.swing.JOptionPane;

public class Clases {

    public Clases() {

    }
    Integer[] age = new Integer[15];
    String[] nombre = new String[15];
    Integer posicion = 0;

    public void Capturar() {
        if (posicion < 15) {
            nombre[posicion] = ventana.nombre.getText();
            age[posicion] = Integer.parseInt(ventana.edad.getText());
            posicion++;
            String pos=String.valueOf(posicion);
            ventana.contador.setText(pos);
        } else {
JOptionPane.showMessageDialog(null,"Ya no se puede captrurar mas registros","Error alañadir registros", JOptionPane.PLAIN_MESSAGE);
        }

    }
    public void Imprimir() {
        for (int i = 0; i < posicion; i++) {
        JOptionPane.showMessageDialog(null, "El nombre capturado es: " + nombre[i] + "\nLa edad captura es:" + age[i    ], "Mensaje", JOptionPane.PLAIN_MESSAGE);    
        }
        
    }
}
