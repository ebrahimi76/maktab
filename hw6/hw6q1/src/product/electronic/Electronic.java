package product.electronic;

import product.Product;

public class Electronic extends Product {

    private String type;
    private int size;

    public Electronic(String name, String type, int size, int price) {
        super(name, price);
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
