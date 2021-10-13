package product.publish;
public class Books extends Publish {

    private int pages;
    private String author;

    public Books(String name, String author, int page, int price) {
        super(name, price);
        this.author = author;
        this.pages = page;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + super.getName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", pages='" + pages + '\'' +
                ", author='" + author +  '\'' +
                "}\n";
    }
}
