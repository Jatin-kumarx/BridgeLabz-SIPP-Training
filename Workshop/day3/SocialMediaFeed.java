package Workshop.day3;
public class SocialMediaFeed {
    public static void main(String[] args) throws InterruptedException {
        NotificationFeed feed = new NotificationFeed();

        feed.add(new LikeNotification("Alice"));
        Thread.sleep(100);
        feed.add(new CommentNotification("Bob", "Nice photo!"));
        Thread.sleep(100);
        feed.add(new LikeNotification("Charlie"));
        Thread.sleep(100);
        feed.add(new CommentNotification("Daisy", "Awesome update!"));

        feed.show();
    }
}
