package Utils;

import java.util.Comparator;
import Models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto c1, Contacto c2) {
        //primero el apellido orden alfabetico
        //Segundo si son iguales comparo por el nombre orden alfabético

             int result = c1.getApellido().compareTo(c2.getApellido());
             
             if (result == 0) {
                 result = c1.getNombre().compareTo(c2.getNombre());
             }

             return result;
    }
    
     
}