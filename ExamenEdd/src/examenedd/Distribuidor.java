package examenedd;
public class Distribuidor {
    private String Nombre;
    private String Ubicacion;
    private String Producto;
    private String Seccion;

    public Distribuidor(String Nombre, String Ubicacion, String Producto, String Seccion) {
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.Producto = Producto;
        this.Seccion = Seccion;
    }

   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
    public void llenar(){
        System.out.println("Ingrese el nombre de la distribuidora: ");
        Nombre = Leer.dato();
        System.out.println("La ubicacion de la distribuidora: ");
        Ubicacion = Leer.dato();
        System.out.println("El producto de la distribuidora: ");
        Producto = Leer.dato();
        System.out.println("La seccion de la distribuidora: ");
        Seccion = Leer.dato();
    }
    public void mostrar(){
        System.out.println("El nombre de la distribuidora es: " + Nombre);
        System.out.println("La ubicacion de la distribuidora es: " + Ubicacion);
        System.out.println("El producto de la distribuidora: " + Producto);
        System.out.println("La seccion de la distribuidora es: " + Seccion);
        System.out.println(" ");
    }
}
