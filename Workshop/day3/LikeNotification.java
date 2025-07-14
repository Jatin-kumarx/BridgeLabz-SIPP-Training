package Workshop.day3;

public class LikeNotification extends Notification {
    String user;

    public LikeNotification(String user) {
        super(user + " liked your post");
        this.user = user;
    }

    
    public void display() {
        System.out.println(message + " at " + time);
    }
}

