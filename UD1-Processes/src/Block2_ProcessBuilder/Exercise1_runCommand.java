package Block2_ProcessBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1_runCommand {
    public static void main(String[] args) {

        String so = System.getProperty("os.name").toLowerCase();

        String comandoUsuario = "dir";

        try {
            ProcessBuilder pb = new ProcessBuilder();

            // En Windows necesitamos cmd.exe /C para ejecutar comandos del shell
            // En Linux/Mac el comando se puede ejecutar directamente
            if (so.contains("windows")) {
                pb.command("cmd.exe", "/C", comandoUsuario);
            } else {
                pb.command("bash", "-c", comandoUsuario);
            }

            Process proceso = pb.start();

            // Leemos la salida estándar del proceso línea a línea
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(proceso.getInputStream())
            );

            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            // Esperamos a que termine e interpretamos el código de retorno
            int codigo = proceso.waitFor();

            System.out.println("\n--- Fin de la ejecución ---");
            if (codigo == 0) {
                System.out.println("El proceso terminó correctamente (código: 0)");
            } else {
                System.out.println("El proceso terminó con error (código: " + codigo + ")");
            }

        } catch (IOException e) {
            // El comando no existe o no se puede ejecutar
            System.out.println("Error: no se pudo ejecutar el comando '" + args[0] + "'. " + e.getMessage());
        } catch (InterruptedException e) {
            // El hilo principal fue interrumpido mientras esperaba
            System.out.println("La ejecución fue interrumpida.");
        }
    }
}