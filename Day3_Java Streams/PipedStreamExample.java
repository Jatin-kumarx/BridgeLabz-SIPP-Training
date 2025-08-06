import java.io.*;

public class PipedStreamExample {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello from Writer Thread!".getBytes());
                pos.close();
            } catch (IOException e) {
                System.out.println("Writer Error: " + e.getMessage());
            }
        });

        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
                pis.close();
            } catch (IOException e) {
                System.out.println("Reader Error: " + e.getMessage());
            }
        });

        writer.start();
        reader.start();
    }
}