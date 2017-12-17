package instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String material, String family, String colour, int numberOfStrings) {
        super(material, family, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
