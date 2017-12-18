import instruments.Guitar;
import instruments.guitarparts.GuitarBody;
import instruments.guitarparts.GuitarNeck;
import instruments.guitarparts.GuitarString;
import org.junit.Before;
import org.junit.Test;
import shop.ISell;
import shop.Shop;
import shop.items.InstrumentForSale;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

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
    private ISell testInstrumentForSale;
    private Shop testShop;

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
        testShop = new Shop();
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(200, testInstrumentForSale.calculateMarkup());
    }

    @Test
    public void shopStartsEmpty() {
       ArrayList<ISell> test = new ArrayList<>();
       assertEquals(test, testShop.getStock());
    }

    @Test
    public void canAddItem() {
        testShop.addStock(testInstrumentForSale);
        assertEquals(1, testShop.getStock().size());
    }

    @Test
    public void canGetItem() {
        testShop.addStock(testInstrumentForSale);
        assertEquals(testInstrumentForSale, testShop.getStock().get(0));
    }

    @Test
    public void canRemoveItem() {
        testShop.addStock(testInstrumentForSale);
        assertEquals(1, testShop.getStock().size());
        testShop.removeStock(testInstrumentForSale);
        assertEquals(0, testShop.getStock().size());
    }

}
