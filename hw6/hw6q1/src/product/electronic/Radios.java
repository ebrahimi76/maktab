package product.electronic;

public class Radios extends Electronic {

    private String color;

    public Radios(String name, String type, int size, String color, int price) {
        super(name, type, size, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Radios{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", type='" + super.getType()+ '\'' +
                ", size='" + super.getSize() + '\'' +
                "color='" + color + '\'' +
                "}\n";
    }
}
