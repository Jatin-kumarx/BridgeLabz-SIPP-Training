package Workshop.day3;

public class CommentNotification extends Notification {
    String user;
    String comment;

    public CommentNotification(String user, String comment) {
        super(user + " commented: \"" + comment + "\"");
        this.user = user;
        this.comment = comment;
    }
    
    public void display() {
        System.out.println(message + " at " + time);
    }
}
