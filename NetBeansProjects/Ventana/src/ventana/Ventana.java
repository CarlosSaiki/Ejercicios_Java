package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    public Ventana() {
        setSize(500, 500);
        //setBounds(100, 200, 500, 500); //Establecemos la posicion inicial y el tamaño
        setTitle("El mejor titulo");//Establecer el titulo de la ventana
        setLocationRelativeTo(null);//Establecemos la ventana en el centro
        //setResizable(false);//Establecemos si la ventana puede cambiar de tamaño
        setMinimumSize(new Dimension(200, 200));//Establecemos el tamaño minimo
        //this.getContentPane() .setBackground(Color.GREEN);//Establecer el color de la ventana
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();//Creacion deun panel
        panel.setBackground(Color.yellow);//Establecemos el color del panel
        panel.setLayout(null);//Desactivar el Diseño
        this.getContentPane().add(panel);//Agregamos el panel a la ventana

        JLabel etiqueta = new JLabel();//Creamos una etiqueta
        etiqueta.setText("Avalanch");//Establecemos el texto de la etiqueta
        etiqueta.setBounds(85, 10, 300, 40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Establecemos la alineacion horizontal del texto
        etiqueta.setForeground(Color.white);//Establecemos color de la letra
        //etiqueta.setOpaque(true);//Empecemos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.black);//Cambiamos el color de fondo de la etiqueta
        etiqueta.setFont(new Font("arial", Font.ITALIC, 30));//Establecemos la fuente del texto
        panel.add(etiqueta);//Agregamos la etiqueta al panel
        
        ImageIcon imagen= new ImageIcon("Avalanch.jpeg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(100, 50, 307, 164);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);

    }

}
