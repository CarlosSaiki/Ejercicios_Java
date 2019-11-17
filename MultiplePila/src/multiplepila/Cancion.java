package multiplepila;

public class Cancion {

    private String titulo, formato, cantante;
    private int dur;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public void leer() {
        cantante = Leer.dato();
        titulo = Leer.dato();
        formato = Leer.dato();
        dur = Leer.datoInt();
    }

    public void mostrar() {
        System.out.println(cantante + " " + titulo + " " + formato + " " + dur);
    }

    public boolean igual(Cancion a) {
        if (getCantante().equals(a.getCantante()) && getTitulo().equals(a.getTitulo()) && getFormato().equals(a.getFormato()) && getDur() == a.getDur()) {
            return true;
        }
        return false;
    }

}
