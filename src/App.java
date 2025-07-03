
import Controllers.ContactoController;
import Controllers.Ejercicios;
import Controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: CARLOS ANTONIO GORDILLO TENEMAZA");
        System.out.println("Correo: cgordillot@est.ups.edu.ec\n");
        Sets sets = new Sets();
        /*
         * runHashSet(sets);
         * runLinkedHashSet(sets);
         * runTreeSet(sets);
         * runTreeSetConComparador(sets);
         * runTreeSetConComparadorInverso(sets);
         */

        /*ContactoController contactoController = new ContactoController();
        System.out.println("Contactos orden alfabetico apellido - nombre");
        contactoController.runTreeContacto();

        System.out.println("");

        System.out.println("Contactos orden alfabetico apellido - nombre - telefono (des)");
        contactoController.runTreeContactoConnumeroTacto();*/

         // Ejercicios Propuestos
        System.out.println("===== EJERCICIOS =====");
        Ejercicios ejercicios = new Ejercicios();

    }

    /*
     * crear un metodo estatico "runHashSet" que reciba una instancia de la clase
     * Sets y llame al metodo construirHashSet
     */

    /*
     * public static void runHashSet(Sets sets) {
     * Set<String> resultado = sets.construirHashSet();
     * System.out.println("====HashSet====");
     * System.out.println("Elementos del HashSet(no se garantiza orden): ");
     * for (String palabra : resultado) {
     * System.out.println(palabra);
     * 
     * }
     * }
     * 
     * public static void runLinkedHashSet(Sets sets) {
     * Set<String> resultado = sets.construirLinkedHashSet();
     * System.out.println("\n====LinkedHashSet====");
     * System.out.
     * println("Elementos del LinkedHashSet (respeta el orden de insercion): ");
     * for (String palabra : resultado) {
     * System.out.println(palabra);
     * }
     * }
     * 
     * public static void runTreeSet(Sets sets) {
     * Set<String> resultado = sets.construirTreeSet();
     * System.out.println("\n====TreeSet====");
     * System.out.println("Elementos del TreeSet (orden alfabetico):");
     * for (String palabra : resultado) {
     * System.out.println(palabra);
     * }
     * }
     * 
     * public static void runTreeSetConComparador(Sets sets) {
     * Set<String> resultado = sets.construirTreeSetConComparador();
     * System.out.println("\n====TreeSetConComparador====");
     * System.out.println("Elementos del TreeSet con comparador de longitud:");
     * for (String palabra : resultado) {
     * System.out.println(palabra);
     * }
     * }
     * 
     * public static void runTreeSetConComparadorInverso(Sets sets) {
     * Set<String> resultado = sets.construirTreeSetConComparadorInverso();
     * System.out.println("\n====TreeSetConComparadorInverso====");
     * System.out.println("Elementos del TreeSet con comparador inverso:");
     * for (String palabra : resultado) {
     * System.out.println(palabra);
     * }
     * }
     */

}
