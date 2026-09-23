package Block2_ProcessBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_Calculator {
    private static int contadorFicheros = 0;

    public static void main(String[] args) {

        // Lanzamos varios sumadores con distintos rangos
        lanzarSumador("sumar", 1, 10);    // resultado esperado: 55
        lanzarSumador("sumar", 1, 100);   // resultado esperado: 5050
        lanzarSumador("sumar", 5, 15);    // resultado esperado: 110
    }

    private static void lanzarSumador(String operacion, int inicio, int fin) {
        contadorFicheros++;
        String ficheroSalida = "resultado_" + contadorFicheros + ".txt";

        System.out.println("Lanzando Sumador(" + inicio + ", " + fin + ")...");

        try {
            ProcessBuilder pb = new ProcessBuilder(
                    "java", "OperacionesMatematicas",
                    operacion,
                    String.valueOf(inicio),
                    String.valueOf(fin)
            );

            // Redirigimos la salida al fichero numerado
            pb.redirectOutput(new File(ficheroSalida));

            Process proceso = pb.start();

            // Esperamos a que termine e interpretamos el código de retorno
            int codigo = proceso.waitFor();

            if (codigo == 0)
                System.out.println("  ✓ Resultado guardado en: " + ficheroSalida);
            else
                System.out.println("  ✗ Error desconocido. Código: " + codigo);

        } catch (IOException e) {
            System.out.println("  No se pudo lanzar el Sumador: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("  La espera fue interrumpida.");
        }
    }
}


