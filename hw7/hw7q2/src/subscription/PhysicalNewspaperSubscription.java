package subscription;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    public PhysicalNewspaperSubscription(String name) {
        super(name);
    }

    @Override
    public void setAddress(String address) {
        address = address.trim();
        if(check(address)){
            super.address=address;
            setPrice(15);
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
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "PhysicalNewspaperSubscription{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +"$"+
                '}';
    }
}
