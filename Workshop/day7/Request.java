public class Request<T extends Book> {
    String user;
    T book;

    public Request(String user, T book) {
        this.user = user;
        this.book = book;
    }

    public void displayRequest() {
        System.out.println("User: " + user + " requested " + book.getDetails());
    }
}