package Controllers;

import java.util.Set;
import java.util.TreeSet;
import Models.Contacto;
import Utils.ContactoComparator;
import Utils.ContactoComparatorConNumero;

public class ContactoController {
    
    public ContactoController(){
       
    }
    

    public void runTreeContacto(){
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }

    public void runTreeContactoConnumeroTacto(){
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparatorConNumero());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }

}
