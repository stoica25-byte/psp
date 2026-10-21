package exercise6_producerConsumer;

public class Main {
    public static void main(String[] args) {
        String message = "Message to send";
        Buffer buffer = new Buffer();
        new Writer(buffer, message).start();
        new Reader(buffer, message.length()).start();
    }
}
