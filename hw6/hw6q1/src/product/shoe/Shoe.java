package product.shoe;

import product.Product;

public class Shoe extends Product {

    private int size;

    public Shoe(String name, int size, int price) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + super.getName() + '\'' +
                ", price'=" + super.getPrice() + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
