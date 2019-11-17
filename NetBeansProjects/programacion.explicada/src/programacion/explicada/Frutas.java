package programacion.explicada;

import javax.swing.JOptionPane;

public class Frutas {
    private String Nombre;
    private String Tamaño;
    private String Maduracion;
    private String Color;

    public Frutas() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getMaduracion() {
        return Maduracion;
    }

    public void setMaduracion(String Maduracion) {
        this.Maduracion = Maduracion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    public void leer() {
        
       
        Nombre= JOptionPane.showInputDialog("Ingrese el nombre de la fruta: ");
        Tamaño = JOptionPane.showInputDialog("Ingrese el tamaño de la fruta: ");
        Maduracion=JOptionPane.showInputDialog("Ingrese si la fruta esta madura: ");
        Color=JOptionPane.showInputDialog("Ingrese el color de la fruta: ");

    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null,"El nombre de la fruta es: "+Nombre);
        JOptionPane.showMessageDialog(null,"El tamaño de la fruta es: "+Tamaño);
        JOptionPane.showMessageDialog(null,"¿La fruta esta madura?"+Maduracion);
        JOptionPane.showMessageDialog(null,"El color de la fruta es: "+Color);

        
        
    }
}
