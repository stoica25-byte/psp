import java.util.ArrayList;
import java.util.List;

public class Example2 {
     public static void main(String[] args) {
        // Generamos 100.000 elementos
        List<Integer> datos = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            datos.add(i);
        }

        // Secuencial
        long inicio = System.currentTimeMillis();
        long suma = datos.stream()
            .map(i -> (int) Math.sqrt(i))
            .map(Example2::operacionCostosa)
            .reduce(0, Integer::sum);
        long tiempoSecuencial = System.currentTimeMillis() - inicio;

        // Paralelo
        inicio = System.currentTimeMillis();
        suma = datos.parallelStream()
            .map(i -> (int) Math.sqrt(i))
            .map(Example2::operacionCostosa)
            .reduce(0, Integer::sum);
        long tiempoParalelo = System.currentTimeMillis() - inicio;

        System.out.println("Secuencial: " + tiempoSecuencial + " ms");
        System.out.println("Paralelo:   " + tiempoParalelo + " ms");
        System.out.println("Mejora: x" +
            String.format("%.1f", (double) tiempoSecuencial / tiempoParalelo));
        System.out.println("Núcleos disponibles: " +
            Runtime.getRuntime().availableProcessors());
    }

    public static int operacionCostosa(int numero) {
        int suma = 0;
        for (int i = 1; i < 1000000; i++) {
            suma += numero / i;
        }
        return suma;
    }

}
