public class HardCopyBook extends Book {
    String shelfLocation;

    public HardCopyBook(String title, String author, String shelfLocation) {
        super(title, author);
        this.shelfLocation = shelfLocation;
    }

    public String getDetails() {
        return super.getDetails() + " (Hardcopy, Shelf: " + shelfLocation + ")";
    }
}