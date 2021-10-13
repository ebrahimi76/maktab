package product.electronic;

public class Televisions extends Electronic {

    private String resolotion;

    public Televisions(String name, String type, int size, String resolotion, int price) {
        super(name, type, size, price);
        this.resolotion = resolotion;
    }

    public String getResolotion() {
        return resolotion;
    }

    @Override
    public String toString() {
        return "Televisions{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", type='" + super.getType()+ '\'' +
                ", size='" + super.getSize() + '\'' +
                "resolotion='" + resolotion + '\'' +
                "}\n";
    }
}
