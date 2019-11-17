package examenedd;
public class PrincipalDistribuidor {
    public static void main(String[] args) {
        PilaDistribuidor A=new PilaDistribuidor();
        Distribuidor obj1=new Distribuidor("Inti", "Viacha", "Mentisan", "Medicamentos");
        Distribuidor obj2=new Distribuidor("San Gabriel", "Viacha", "Pan", "Canasta Familiar");
        Distribuidor obj3=new Distribuidor("Imba", "Satelite", "Pollo", "Alimentos");
        Distribuidor obj4=new Distribuidor("San Mateo", "Viacha", "Trago", "Bebidas");
        
        A.adicionar(obj1);
        A.adicionar(obj2);
        A.adicionar(obj3);
        A.adicionar(obj4);
        A.mostrar();
        
        
                
    }
}
