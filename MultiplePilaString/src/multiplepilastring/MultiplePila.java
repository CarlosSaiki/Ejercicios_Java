package multiplepilastring;
public class MultiplePila {
    private Pila v[]=new Pila[50];
    private int np;

    MultiplePila() {
        for (int i = 1; i < 20; i++) {
            v[i]=new Pila();
            
        }
    }
    int nroPilas(){
        return (np);
    }
    int nroelementos(int i){
        return(v[i].nroelementos());
    }
    boolean esvacia(int i){
        return(v[i].esvacia());
    }
    boolean esllena(int i){
        return(v[i].esllena());
    }
    void adicionar(int i, String L){
        if(!v[i].esllena()){
            v[i].adicionar(L);
        }else{
            System.out.println("Pila "+i+ " esta llena");
        }
    }
    String eliminar(int i){
      String e="";
        if(!v[i].esvacia()){
            e=v[i].eliminar();
        }else{
            System.out.println("Pila "+i+" esta vacia");
        }
        return e;
    }
    void llenar(int n){
        int i,m;
        np=n;
        for (i = 1; i <=n; i++) {
            System.out.println("\nNro. elementos Pila "+i+":");
            m=Leer.datoInt();
            v[i].llenar(m);
        }
    }
    void llenar(int i, int n){
        v[i].llenar(n);
    }
    void mostrar(){
        for (int i = 1; i <=np; i++) {
            System.out.println("\n\nDatos Pila "+i+" ");
            mostrar(i);
        }
    }
    void mostrar(int i){
        v[i].mostrar();;
    }
    void vaciar(int i,  Pila Z){
        v[i].vaciar(Z);
    }
    public void vaciar(int i,int j){
        v[i].vaciar(v[j]);
    }
    public int getNp(){
        return np;
    }
    public void setNp(int np){
        this.np=np;
    }
    
}
