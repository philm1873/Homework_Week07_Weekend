import instruments.Guitar;
import instruments.guitarparts.GuitarBody;
import instruments.guitarparts.GuitarNeck;
import instruments.guitarparts.GuitarString;
import org.junit.Before;
import org.junit.Test;
import shop.items.InstrumentForSale;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopTest {
    private Guitar testGuitar;
    private ArrayList<GuitarString> strings;
    private GuitarNeck testNeck;
    private GuitarBody testBody;
    private GuitarString string1;
    private GuitarString string2;
    private GuitarString string3;
    private GuitarString string4;
    private GuitarString string5;
    private GuitarString string6;
    private InstrumentForSale<Guitar> testInstrumentForSale;

    @Before
    public void before() {
        testNeck = new GuitarNeck("Mahogany");
        testBody = new GuitarBody("Telecaster", "Mahogany");
        string1 = new GuitarString('E', "Steel");
        string2 = new GuitarString('B', "Steel");
        string3 = new GuitarString('G', "Steel");
        string4 = new GuitarString('D', "Steel");
        string5 = new GuitarString('A', "Steel");
        string6 = new GuitarString('E', "Steel");
        strings = new ArrayList<>(Arrays.asList(string1, string2, string3, string4, string5, string6));
        testGuitar = new Guitar("Wood", "String", "Black", strings, testNeck, testBody);
        testInstrumentForSale = new InstrumentForSale<>(testGuitar, 1000, 1200);
    }
    

}
