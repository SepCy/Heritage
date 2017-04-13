
package heritage;


public class Avion extends Vehicule {
    public Avion(){
        
        super();
    }
    
    @Override
     public void rouler() throws Exception
     {
         if (altitude>0)
            throw new Exception("L'avion en vol ne peut rouler");
         else super.rouler();
     }
public static void main(String[] args) throws Exception {
    
     Vehicule av= new Vehicule();
     av.rouler();
     
     
        
        
    }



}