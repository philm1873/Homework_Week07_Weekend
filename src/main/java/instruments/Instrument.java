package instruments;

public abstract class Instrument {
    private String material;
    private String family;
    private String colour;

    public Instrument(String material, String family, String colour) {
        this.material = material;
        this.family = family;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String type) {
        this.family = family;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}


