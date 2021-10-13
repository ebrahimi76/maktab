package product.publish;

public class Magazines extends Publish {

    private int version;
    private String company;

    public Magazines(String name, String company, int version, int price) {
        super(name, price);
        this.version = version;
        this.company = company;
    }

    public int getVersion() {
        return version;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", version='" + version + '\'' +
                ", company='" + company +  '\'' +
                "}\n";
    }
}
