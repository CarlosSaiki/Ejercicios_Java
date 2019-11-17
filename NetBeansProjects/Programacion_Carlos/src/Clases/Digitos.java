package Clases;

public class Digitos {

    int n, c, d, n1, n2, n3, n4, n5, a, nu, d2, c2, d3, c3, d4, pr;

    public Digitos(int n) {
        this.n = n;
    }

    public void Contar() {
        n1 = n;
        while (n1 != 0) {
            n1 = n1 / 10;
            c++;
        }
        System.out.println("El numero tiene " + c + " digitos");
    }

    public void Invertir() {
        n2 = n;
        while (n2 > 0) {
            d = n2 % 10;
            n2 = (n2 / 10);
            nu = nu * 10 + d;
        }
        System.out.println("El numero invertido es: " + nu);
    }

    public void Multiplos() {
        n3 = n;
        while (n3 > 0) {
            d2 = n3 % 10;
            if (d2 % 2 == 0 && d2>0) {
                
                c2++;
            }
            n3 = (n3 / 10);
        }
        System.out.println("El numero tiene " + c2 + " digitos multiplos de 2");

    }

    public void Primos() {
        int cn=n, res;
        int dig,contadorPrimos=0;
        while(cn>0){
            dig=cn%10;
            res=esPrimo(dig);
            if(res==1){
                contadorPrimos++;
            }
            cn=cn/10;
        }
        System.out.println("El numero tiene "+contadorPrimos+" digitos primos");
    }
    public static int esPrimo(int x){
        int sw;
        int contador,i;
        contador=0;
        for(i=1;i<=x;i++){
            if(x%i==0){
                contador++;
            }
        }
        if(contador==2){
            sw=1;
        }else{
            sw=0;
        }
        return sw;
    }
}
