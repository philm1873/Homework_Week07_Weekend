package instruments;

import instruments.guitarparts.GuitarBody;
import instruments.guitarparts.GuitarString;
import instruments.guitarparts.GuitarNeck;

import java.util.ArrayList;

public class Guitar extends Instrument implements IPlay {
    private ArrayList<GuitarString> Strings;
    private GuitarNeck neck;
    private GuitarBody body;

    public Guitar(String material, String family, String colour, ArrayList<GuitarString> strings,
                  GuitarNeck neck, GuitarBody body) {
        super(material, family, colour);
        Strings = strings;
        this.neck = neck;
        this.body = body;
    }

    public String play() {
        return "Guitar Sounds";
    }
}
