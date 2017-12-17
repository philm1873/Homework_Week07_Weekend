package instruments;

public class Trumpet extends Instrument{
    int numberOfValves;

    public Trumpet(String material, String family, String colour, int numberOfValves) {
        super(material, family, colour);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
}
