package mi_ventana;

import javax.swing.JOptionPane;

public class data {

    public data() {

    }
    Integer[] age = new Integer[3];
    String[] nombre = new String[3];
    Integer pocicion = 0;

    public void capturaDatos() {
        if (pocicion < 3) {
            nombre[pocicion] = Luis.nombre.getText();
            age[pocicion] = Integer.parseInt(Luis.edad.getText());
            pocicion++;
            String pos = String.valueOf(pocicion);
            Luis.contador.setText(pos);
        } else {
            JOptionPane.showMessageDialog(null, "errror ya no se pueden capturar mas registros", "error al añadir registros", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void imprimirdatos() {
        for (int i = 0; i < pocicion; i++) {
            JOptionPane.showMessageDialog(null, "El nombre capturado es = " + nombre[i] + "\nLa edad esta la persona es = " + age[i], "Mesaje", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
