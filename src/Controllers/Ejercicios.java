package Controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("Ejercicio 1: Tiene duplicados");
        System.out.println("Entrada [1, 2, 3, 4, 5] : " + tieneDuplicado(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(
                "Entrada [1, 2, 3, 4, 5, 4, 3, 2, 45] : " + tieneDuplicado(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 45 }));

        System.out.println("\nEjercicio 2: Palabra es Isograma");
        System.out.println("murcielago es isograma: " + esIsograma("murcielago"));
        System.out.println("camaleon es isograma: " + esIsograma("camaleon"));

        String texto = """
                    La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?

                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
                """;
        System.out.println("\nEjercicio 3: Total de palabras unicas");
        System.out.println("Total de palabras unicas en el texto: " + contarPalabrasUnicas(texto));

    }

    public boolean tieneDuplicado(int[] numeros) {
        Set<Integer> set = new HashSet<>();
        for (int num : numeros) {
            if (!set.add(num)) {
                return true; // Se encontro un duplicado
            }
        }
        return false; // No hay duplicados
    }

    public boolean esIsograma(String palabra) {
        Set<Character> letras = new HashSet<>();
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (!letras.add(c)) {
                return false; // Letra repetida
            }
        }
        return true; // Todas las letras son unicas
    }

    public int contarPalabrasUnicas(String frase) {
        String[] palabras = frase.split(" ");

        Set<String> unicas = new HashSet<>();

        for (String palabra : palabras) {
            unicas.add(palabra);
        }

        return unicas.size();
    }

}
