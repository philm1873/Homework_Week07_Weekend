package shop.items;

import instruments.Instrument;
import shop.ISell;

public class InstrumentForSale <T extends Instrument> implements ISell {
    private T item;
    private int buyPrice;
    private int sellPrice;

    public InstrumentForSale(T item, int buyPrice, int sellPrice) {
        this.item = item;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public T getItem() {
        return item;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }


}
