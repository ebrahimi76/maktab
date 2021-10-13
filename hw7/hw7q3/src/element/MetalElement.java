package element;

public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println(
                "Metal:" +
                        "\nSymbol: " + getSymbol() +
                        "\nAtomic Number: " + getAtomicNumber() +
                        "\nAtomic Weight: " + getAtomicWeight() +
                        "\n>> A metal is a material that, when freshly prepared, polished, or fractured, shows a" +
                        "\nlustrous appearance, and conducts electricity and heat relatively well. Metals are" +
                        "\ntypically malleable (they can be hammered into thin sheets) or ductile (can be drawn" +
                        "\ninto wires). A metal may be a chemical element such as iron; an alloy such as stainless" +
                        "\nsteel; or a molecular compound such as polymeric sulfur nitride.");
    }
}
