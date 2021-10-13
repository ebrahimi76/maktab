package subscription;

public class DemoSubscriptions {
    NewspaperSubscription newspaper1 = new PhysicalNewspaperSubscription("school");
    NewspaperSubscription newspaper2 = new PhysicalNewspaperSubscription("iran");
    NewspaperSubscription newspaper3 = new OnlineNewspaperSubscription("emrooz");
    NewspaperSubscription newspaper4 = new OnlineNewspaperSubscription("farda");

    public void run() {
        newspaper1.setAddress("avenue, hafez street");
        newspaper2.setAddress("avenue2, hafez street");
        newspaper3.setAddress("avenue3, @sadi street");
        newspaper4.setAddress("avenue4, sadi street");
        print();
    }

    private void print() {
        System.out.println(newspaper1);
        System.out.println(newspaper2);
        System.out.println(newspaper3);
        System.out.println(newspaper4);
    }
}