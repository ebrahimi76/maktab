package product.shoe;
public class Sports extends Shoe {

    private String used;

    public Sports(String name, int size, String used, int price) {
        super(name, size, price);
        this.used = used;
    }

    public String getUsed() {
        return used;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", size='" + super.getSize() + '\'' +
                ", used='" + used + '\'' +
                "}\n";
    }
}
