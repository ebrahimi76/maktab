package subscription;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    public OnlineNewspaperSubscription(String name) {
        super(name);
    }

    @Override
    public void setAddress(String address) {
        address = address.trim();
        if(check(address)){
            super.address= address;
            setPrice(9);
        }else{
            super.address="Error";
            setPrice(0);
        }
    }

    @Override
    public void setPrice(int price) {
        super.price=price;
    }

    private boolean check(String str){
        return str.contains("@");
    }

    @Override
    public String toString() {
        return "OnlineNewspaperSubscription{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +"$"+
                '}';
    }
}
