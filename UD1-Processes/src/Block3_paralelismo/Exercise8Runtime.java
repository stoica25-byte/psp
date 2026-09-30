public class Exercise8Runtime {
    public static void main(String[] args) {
        /*
            Use the Runtime class to get and display information about the machine the program is running on. Display the information clearly and formatted.
            Requirements:
            Number of processors (cores) available to the JVM
            Total memory allocated to the JVM (in MB)
            Free memory available in the JVM (in MB)
            Memory currently in use (in MB) — calculate this from the values above

        */

                Runtime runtime = Runtime.getRuntime();
                long memoriaAlocada = runtime.totalMemory() / 1024 /1024;
                long memoriaUsada = runtime.maxMemory() / 1024 /1024;
                long total = memoriaAlocada + memoriaUsada;
                System.out.println("Cores disponibles: "+ runtime.availableProcessors());
                System.out.println("Memoria alocada: "+ memoriaAlocada + " MB");
                System.out.println("Memoria disponible: "+ memoriaUsada + " MB");
                System.out.println("Memoria usada en total : " + total);

    }
}
