public class Main {
    public static void main(String[] args) {
        RequestQueue<Book> queue = new RequestQueue<>();

        EBook ebook = new EBook("Digital Fortress", "Dan Brown", "PDF");
        HardCopyBook hardBook = new HardCopyBook("Atomic Habits", "James Clear", "Shelf B2");

        Request<Book> req1 = new Request<>("User A", ebook);
        Request<Book> req2 = new Request<>("User B", hardBook);

        queue.addRequest(req1);
        queue.addRequest(req2);
        queue.processRequests();
    }
}