package site;

import product.Product;
import product.electronic.Radios;
import product.electronic.Televisions;
import product.publish.Books;
import product.publish.Magazines;
import product.shoe.Formals;
import product.shoe.Sports;

import java.util.Arrays;

public class Products {
    private Product[] books = new Books[3];
    private Product[] magazines = new Magazines[2];
    private Product[] sports = new Sports[4];
    private Product[] formals = new Formals[3];
    private Product[] televisions = new Televisions[2];
    private Product[] radios = new Radios[3];

    public void setProducts() {
        books[0] = new Books("1984", "George Orwell", 328, 21530);
        books[1] = new Books("Toxic People", "Lillian Glass", 264, 120000);
        books[2] = new Books("Dummies", "Brenda Hoddinott", 333, 67730);

        magazines[0] = new Magazines("Disney Comics", "Comic World", 60, 18000);
        magazines[1] = new Magazines("Attack On Titan", "Kodansha Comics", 3, 220000);

        sports[0] = new Sports("BLGRE", 35, "Hand Ball", 199000);
        sports[1] = new Sports("Adidas Messi", 28, "Futsal", 365000);
        sports[2] = new Sports("MQ02", 24, "Walking", 219000);
        sports[3] = new Sports("BARSA-SO", 34, "Walking", 179000);

        formals[0] = new Formals("SHO136", 43, "Leather", 157000);
        formals[1] = new Formals("Milan", 40, "Linen", 201000);
        formals[2] = new Formals("K.BAZ.102", 40, "Leather", 91000);

        televisions[0] = new Televisions("LG GTV-50LU722S", "Smart LED", 50, "4k", 10290000);
        televisions[1] = new Televisions("Snowa SSD-50SA620U", "Smart LED", 50, "4k", 11250000);

        radios[0] = new Radios("Golon", "Desktop", 13, "RED", 222000);
        radios[1] = new Radios("Meier", "Desktop", 23, "DARK-BROWN", 608000);
        radios[2] = new Radios("Sony", "Pocket", 13, "BLACK", 1300000);
    }

    public Product[] getBooks() {
        return books;
    }

    public Product[] getMagazines() {
        return magazines;
    }

    public Product[] getSports() {
        return sports;
    }

    public Product[] getFormals() {
        return formals;
    }

    public Product[] getTelevisions() {
        return televisions;
    }

    public Product[] getRadios() {
        return radios;
    }

    @Override
    public String toString() {
        return "Products:" +
                "\nbooks=\n" + Arrays.toString(books) +
                ", magazines=\n" + Arrays.toString(magazines) +
                ", sports=\n" + Arrays.toString(sports) +
                ", formals=\n" + Arrays.toString(formals) +
                ", televisions=\n" + Arrays.toString(televisions) +
                ", radios=\n" + Arrays.toString(radios)
                ;
    }
}
