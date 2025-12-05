import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " subscribed.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " unsubscribed.");
    }

    public void publishNews(String news) {
        System.out.println("\nBREAKING NEWS: " + news);
        notifySubscribers(news);
    }

    private void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}