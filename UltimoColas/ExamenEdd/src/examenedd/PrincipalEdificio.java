package examenedd;
public class PrincipalEdificio {
    public static void main(String[] args) {
        Edificio obj1=new Edificio("Santa Cruz", 30, "Palace", "Comercio");
        obj1.setParkeo("Si tiene parkeo");
        obj1.setCuentaconPenhouse("No cuenta con Penhouse");
        Edificio obj2=new Edificio("Pando", 40, "Palidum", "Casa de Ciotas", "Cuenta con parkeo");
        obj2.setCuentaconPenhouse("Si cuenta con Penhouse");
        
        Edificio obj3=new Edificio("Satelite", 10, "Monserrat", "Hotel", "si cuentacon Penhouse", "no tiene parkeo");
        obj1.mostrar();
        obj2.mostrar();
        obj3.mostrar();
        
    }
}
