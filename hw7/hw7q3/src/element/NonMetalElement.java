package element;

public class NonMetalElement extends Element {

    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println(
                "Non Metal:" +
                        "\nSymbol: " + getSymbol() +
                        "\nAtomic Number: " + getAtomicNumber() +
                        "\nAtomic Weight: " + getAtomicWeight() +
                        "\n>> In chemistry, a nonmetal is a chemical element that is mechanically weak in its most stable" +
                        "\nform, brittle if solid, and usually gains or shares electrons in chemical reactions. There is" +
                        "\nno universal agreement on which elements are nonmetals; the numbers generally range from" +
                        "\nfourteen to twenty-three, depending on the criterion or criteria of interest. Typical nonmetals" +
                        "\nlack the shiny appearance of metals; have relatively low melting points, boiling points, and" +
                        "\ndensities; and are poor conductors of heat and electricity. Chemically, they tend to have" +
                        "\nhigher values of ionization energy, electron affinity, and electronegativity; negative or" +
                        "\npositive oxidation states in compounds (whereas metals nearly always have positive oxidation" +
                        "\nstates); and their oxides tend to be acidic. They form many more compounds than do metals. Most" +
                        "\nor some nonmetals share a range of other properties; a few have properties that are anomalous.");
    }
}
