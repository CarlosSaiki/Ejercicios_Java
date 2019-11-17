package curp;

import javax.swing.JOptionPane;

public class curp {

    public curp() {
    }
    Integer dia = 0, año = 0, mes = 0;

    public void getFecha(String a, String b, String c) {
        dia=Integer.parseInt(a);
        mes=Integer.parseInt(b);
        año=Integer.parseInt(c);
        
        JOptionPane.showMessageDialog(null, "La Fecha es "+dia +"/" +mes+" /"+año);
    }
}
