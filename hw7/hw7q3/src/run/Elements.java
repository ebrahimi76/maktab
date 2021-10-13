package run;

import element.Element;
import element.MetalElement;
import element.NonMetalElement;

public class Elements {
    public static void main(String[] args) {
        make();
    }

    public static void make() {
        Element[] elements = new Element[2];
        elements[0] = new MetalElement("Ag", 47, 107.868); //Silver
        elements[1] = new NonMetalElement("Br", 35, 79.90); //Bromine
        print(elements);
    }

    private static void print(Element[] elements) {
        for (Element element : elements) {
            System.out.println();
            element.describeElement();
            System.out.println();
        }
    }
}
