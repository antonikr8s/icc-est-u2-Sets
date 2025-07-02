package Utils;

import java.util.Comparator;
import Models.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto>{



    @Override
    public int compare(Contacto c1, Contacto c2) {
        int result = c1.getApellido().compareTo(c2.getApellido());

        if (result == 0) {
            result = c1.getNombre().compareTo(c2.getNombre());
        }

        if (result == 0) {
            // Comparar teléfono en orden descendente
            result = c2.getTelefono().compareTo(c1.getTelefono());
        }

        return result;
    }
}

    
     
