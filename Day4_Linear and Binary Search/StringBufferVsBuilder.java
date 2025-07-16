
public class StringBufferVsBuilder {
    public static void main(String[] args) {
        int count = 1000000;

        long start1 = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < count; i++) sb1.append("hello");
        long end1 = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end1 - start1) / 1e6 + " ms");

        long start2 = System.nanoTime();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) sb2.append("hello");
        long end2 = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end2 - start2) / 1e6 + " ms");
    }
}
