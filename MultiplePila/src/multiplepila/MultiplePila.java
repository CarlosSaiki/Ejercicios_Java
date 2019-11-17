package multiplepila;
public class MultiplePila {
    private Pila pm[]=new Pila[20];
    private int np;

    MultiplePila() {
        for (int i = 1; i < 20; i++) {
            pm[i]=new Pila();
            
        }
        np=0;
    }
    public int getNp(){
        return np;
    }
    public void setNp(int np){
        this.np=np;
    }
    public int nroPilas(){
        return (np);
    }
    public int nroelementos(int i){
        return(pm[i].nroelementos());
    }
    public boolean esvacia(int i){
        return(pm[i].esvacia());
    }
    public boolean esllena(int i){
        return(pm[i].esllena());
    }
    public void adicionar(int i, Cancion L){
        if(!pm[i].esllena()){
            pm[i].adicionar(L);
        }else{
            System.out.println("Pila "+i+ " esta llena");
        }
    }
    public Cancion eliminar(int i){
        Cancion e=new Cancion();
        if(!pm[i].esvacia()){
            e=pm[i].eliminar();
        }else{
            System.out.println("Pila "+i+" esta vacia");
        }
        return e;
    }
    public void llenar(int n){
        np=n;
        for (int i = 1; i <=n; i++) {
            System.out.println("\nNro. elementos Pila "+i+":");
            int m=Leer.datoInt();
            pm[i].llenar(m);
        }
    }
    public void llenar(int i, int n){
        pm[i].llenar(n);
    }
    public void mostrar(){
        for (int i = 1; i <=np; i++) {
            System.out.println("\n\nDatos Pila "+i+" ");
            mostrar(i);
        }
    }
    public void mostrar(int i){
        pm[i].mostrar();;
    }
    public void vaciar(int i,  Pila Z){
        pm[i].vaciar(Z);
    }
    public void vaciar(int i,int j){
        pm[i].vaciar(pm[j]);
    }
    
    
}
