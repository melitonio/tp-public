import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AnalizadorDeTexto {
    public static void analizarArchivo(String nombreArchivo) {
        int numCaracteres = 0;
        int numPalabras = 0;
        int numParrafos = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                numParrafos++;
                String[] palabras = linea.split("\\s+");
                numPalabras += palabras.length;
                for (String palabra : palabras) {
                    numCaracteres += palabra.length();
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Número de párrafos: " + numParrafos);
    }
}