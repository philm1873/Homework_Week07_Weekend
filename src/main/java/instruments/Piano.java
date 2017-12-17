package instruments;

public class Piano extends Instrument {
    private String type;

    public Piano(String material, String family, String colour, String type1) {
        super(material, family, colour);
        this.type = type1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
