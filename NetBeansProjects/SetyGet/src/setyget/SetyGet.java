package setyget;

public class SetyGet {

    private String nombre, apellido, correo;

    public SetyGet() {
    }

 

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void mostrartodo() {
        System.out.println(getNombre());
        System.out.println(getApellido());
        System.out.println(getCorreo());
    }

}
