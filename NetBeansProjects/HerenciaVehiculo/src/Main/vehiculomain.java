package Main;
import Subclases.acuatico;
import Subclases.aereo;
import Subclases.avion;
import Subclases.barco;
import Subclases.terrestre;
import Subclases.tren;
import java.util.Scanner;


public class vehiculomain {
    public static void main(String[] args) {
        
        String a,b,c;
        Scanner leer=new Scanner(System.in);
        System.out.println("**Acuatico**");
        System.out.println("Ingrese nombre de Vehiculo: ");
        a=leer.nextLine();
        System.out.println("Ingrese el modelo de Vehiculo: ");
        b=leer.nextLine();
        System.out.println("Ingrese Id de Vehiculo: ");
        c=leer.nextLine();
        acuatico agua=new acuatico(a, b, c);
        
        System.out.println("**Terrestre**");
        System.out.println("Ingrese nombre de Vehiculo: ");
        a=leer.nextLine();
        System.out.println("Ingrese el modelo de Vehiculo: ");
        b=leer.nextLine();
        System.out.println("Ingrese Id de Vehiculo: ");
        c=leer.nextLine();
        terrestre tierra=new terrestre(a, b, c);
        
        System.out.println("**Aereo**");
        System.out.println("Ingrese nombre de Vehiculo: ");
        a=leer.nextLine();
        System.out.println("Ingrese el modelo de Vehiculo: ");
        b=leer.nextLine();
        System.out.println("Ingrese Id de Vehiculo: ");
        c=leer.nextLine();
        aereo aire=new aereo(a, b, c);
        agua.mostrar();
        agua.transportar();
        tierra.mostrar();
        tierra.transportar();
        aire.mostrar();
        aire.transportar();
    }
}
