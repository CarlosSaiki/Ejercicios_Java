package examenedd;
public class Edificio {
    private String ubicacion;
    private int numerodepisos;
    private String Nombre;
    private String tipo;
    private String CuentaconPenhouse;
    private String parkeo;

    public Edificio(String ubicacion, int numerodepisos, String Nombre, String tipo, String CuentaconPenhouse, String parkeo) {
        this.ubicacion = ubicacion;
        this.numerodepisos = numerodepisos;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.CuentaconPenhouse = CuentaconPenhouse;
        
    }

    public Edificio(String ubicacion, int numerodepisos, String Nombre, String tipo, String parkeo) {
        this.ubicacion = ubicacion;
        this.numerodepisos = numerodepisos;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.parkeo = parkeo;
    }

    public Edificio(String ubicacion, int numerodepisos, String Nombre, String tipo) {
        this.ubicacion = ubicacion;
        this.numerodepisos = numerodepisos;
        this.Nombre = Nombre;
        this.tipo = tipo;
    }
   
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumerodepisos() {
        return numerodepisos;
    }

    public void setNumerodepisos(int numerodepisos) {
        this.numerodepisos = numerodepisos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCuentaconPenhouse() {
        return CuentaconPenhouse;
    }

    public void setCuentaconPenhouse(String CuentaconPenhouse) {
        this.CuentaconPenhouse = CuentaconPenhouse;
    }

    public String getParkeo() {
        return parkeo;
    }

    public void setParkeo(String parkeo) {
        this.parkeo = parkeo;
    }
    public void mostrar(){
        System.out.println(getCuentaconPenhouse());
        System.out.println(getNombre());
        System.out.println(getNumerodepisos());
        System.out.println(getParkeo());
        System.out.println(getTipo());
        System.out.println(getUbicacion());
        System.out.println(" ");
    }
    
}
