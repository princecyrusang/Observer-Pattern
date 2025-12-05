public class Main {
    public static void main(String[] args) {

        // Create the News Agency
        NewsAgency agency = new NewsAgency();

        // Create Subscribers
        Subscriber s1 = new ConcreteSubscriber("Jerry");
        Subscriber s2 = new ConcreteSubscriber("Tom");
        Subscriber s3 = new ConcreteSubscriber("Spike");

        // Subscribers join
        agency.subscribe(s1);
        agency.subscribe(s2);

        // Publish news
        agency.publishNews("Earthquake hits Manila!");

        // Another subscriber joins later
        agency.subscribe(s3);

        // More news
        agency.publishNews("President announces new policy!");

        // Someone unsubscribes
        agency.unsubscribe(s1);

        // More news
        agency.publishNews("Heavy rainfall expected tomorrow.");
    }
}