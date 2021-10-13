package product.shoe;

public class Formals extends Shoe {

    private String type;

    public Formals(String name, int size, String type, int price) {
        super(name, size, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Formals{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", size='" + super.getSize() + '\'' +
                ", type='" + type + '\'' +
                "}\n";
    }
}
