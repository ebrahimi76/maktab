package subscription;

public abstract class NewspaperSubscription {
    protected String name;
    protected String address="";
    protected int price;

    public NewspaperSubscription(String name) {
        this.name = name;
    }

    public abstract void setAddress(String address);
    public abstract void setPrice(int price);
}
