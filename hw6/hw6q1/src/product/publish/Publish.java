package product.publish;

import product.Product;

public class Publish extends Product {

    public Publish(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Publish{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                "}";
    }
}
