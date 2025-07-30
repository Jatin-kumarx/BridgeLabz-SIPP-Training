import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largefile.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copiedfile.txt"))) {
            byte[] buffer = new byte[4096];
            long startTime = System.nanoTime();
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            long endTime = System.nanoTime();
            System.out.println("Buffered copy done in " + (endTime - startTime) + " ns.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}