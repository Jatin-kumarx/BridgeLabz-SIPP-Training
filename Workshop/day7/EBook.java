public class EBook extends Book {
    String format;

    public EBook(String title, String author, String format) {
        super(title, author);
        this.format = format;
    }

    
    public String getDetails() {
        return super.getDetails() + " (E-Book, Format: " + format + ")";
    }
}