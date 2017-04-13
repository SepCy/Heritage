package heritage;


public class Vehicule {
    
    public int vitesse ;
    public int position;
    public int altitude;

     public void rouler() throws Exception
     {
         position += vitesse;
     }

    
}

