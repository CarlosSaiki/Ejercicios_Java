package imagen;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class clase1 {

    public clase1() {
    }
public void cargarImg(){
    try{
        Icon icon=new ImageIcon(getClass().getResource("/imagenes/verd"));
        ventana1.iconos.setIcon(icon);
    }catch(Exception error){
        JOptionPane.showMessageDialog(null, "Error "+ error);
    }
}
}
