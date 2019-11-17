package arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class arrayClase {

    ArrayList<Integer> enteros = new ArrayList();
    public arrayClase(){
        
    }
    public void agregarDatos(int a){
        enteros.add(a);
    }
    public void mostrarArregloList(){
        for (int i = 0; i < enteros.size(); i++) {
            
        JOptionPane.showMessageDialog(null,"Numero de posicion "+i+" es = "+enteros.get(i));
        
        
        }
    }
}
