package Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Sets() {
    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabrasLinkeadas = new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");

        return palabrasLinkeadas;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabrasOrdenadas = new TreeSet<>();
        palabrasOrdenadas.add("Laptop");
        palabrasOrdenadas.add("Manzana");
        palabrasOrdenadas.add("Pera");
        palabrasOrdenadas.add("Celular");
        palabrasOrdenadas.add("Laptop");
        palabrasOrdenadas.add("Pera");
        palabrasOrdenadas.add("Laptop");

        return palabrasOrdenadas;
    }

    public Set<String> construirTreeSetConComparador() {
        // crear un comparador de longitud

        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                /// Comparamos la longitud
                int result = Integer.compare(s1.length(), s2.length());

                // si tienen la misma longitud, comparamos alfabeticamente
                if (result == 0) {
                    result = s1.compareTo(s2);
                    // return s1.compareTo(s2); ambos sirven
                }
                return result;
            }
        };

        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");

        return miTreeSet;
        /*
         * El comparador nos dice que celular y celulas son las mismas por tener el
         * mismo tamano, entonce,s no se van a imprimir elementos repetidos
         */
    }

    public Set<String> construirTreeSetConComparadorInverso() {
        // Comparador: orden por longitud descendente, luego alfabetico descendente
        Comparator<String> comparadorInverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = Integer.compare(s2.length(), s1.length()); // inverso por longitud
                if (result == 0) {
                    result = s2.compareTo(s1); // inverso alfabético
                }
                return result;
            }
        };

        Set<String> miTreeSet = new TreeSet<>(comparadorInverso);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");

        return miTreeSet;
    }

}
