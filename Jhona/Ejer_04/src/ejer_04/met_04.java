package ejer_04;

import java.util.Scanner;

public class met_04 {
    private int a;
    private int inv;
    private int cap;
    private int pri;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public void entvalor(){
        int b;
        Scanner leer = new Scanner(System.in);
        do{               
        System.out.println("Ingrese valor mayor a 10");
        b = leer.nextInt();
        }while(b < 10);
        this.setA(b);
    }
    
    public int invertir(){
        int seg=getA(),x,y=0;
        while(seg>0){
            x = seg % 10;
            y = (y*10)+x;
            seg = seg / 10;
        }
        this.inv = y;
        return inv;
    }
    
    public void capicua(){
        if(getA() == invertir()){
            System.out.println(getA()+" es número capicua");
        }else{
            System.out.println(getA()+" no es número capicua");
        }
    }
    
    public int primos(){
        int seg=getA(),x,dig=0,cont = 0;
        while(seg>0){
            x = seg % 10;
            seg = seg / 10;
            cont = 0;
            for(int i = 1 ; i <= x ; i++){
                if(x % i == 0)cont++;
            }
            if(cont == 2 || x == 1){
                dig++;
            }
        }
            this.pri = dig;
            return pri;
    }
    
    public void ejecutar(){
        
        this.entvalor();
        System.out.println("El número invertido es: "+ this.invertir());
        this.capicua();
        System.out.println("El numero tiene "+this.primos()+" digitos primos.");
        
    }
}
