package exercise6_producerConsumer;

public class Reader extends Thread {
    private final Buffer buffer;
    private final int length;

    public Reader(Buffer buffer, int length) {
        this.buffer = buffer;
        this.length = length;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < length; i++) {
                System.out.print(buffer.get());
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

