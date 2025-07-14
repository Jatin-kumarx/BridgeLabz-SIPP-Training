package Workshop.day3;
 public abstract class Notification {
    String message;
    long time;

    public Notification(String message) {
        this.message = message;
        this.time = System.currentTimeMillis(); // capture timestamp
    }

    public abstract void display();
}

