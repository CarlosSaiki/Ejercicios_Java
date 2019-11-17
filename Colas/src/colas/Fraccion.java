package colas;
public class Fraccion {
    private int num;
    private int den;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    public void leer(){
        System.out.println("\nNum: ");
        num=Leer.datoInt();
        System.out.println("Den: ");
        den=Leer.datoInt();
    }
    public void mostrar(){
        System.out.println("\n"+num+"\t"+den);
    }
    public boolean Igual(Fraccion a){
        if(a.getNum()==getNum()&&getDen()==a.getDen()){
            return(true);
        }
        return(false);
    }
}
