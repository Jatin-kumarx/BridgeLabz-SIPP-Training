import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue<T extends Book> {
    Queue<Request<T>> queue = new LinkedList<>();

    public void addRequest(Request<T> request) {
        queue.add(request);
    }

    public void processRequests() {
        while (!queue.isEmpty()) {
            Request<T> r = queue.poll();
            r.displayRequest();
        }
    }
}