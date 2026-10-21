package exercise6_producerConsumer;

public class Writer extends Thread {
    private final Buffer buffer;
    private final String message;

    public Writer(Buffer buffer, String message) {
        this.buffer = buffer;
        this.message = message;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < message.length(); i++) {
                buffer.put(message.charAt(i));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
