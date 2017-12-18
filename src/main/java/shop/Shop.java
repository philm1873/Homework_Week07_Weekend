package shop;

import java.util.ArrayList;

public class Shop {
    ArrayList<ISell> items;

    public Shop() {
        this.items = new ArrayList<>();
    }

    public ArrayList<ISell> getItems() {
        return items;
    }

    public void addItem(ISell item) {
        items.add(item);
    }
}
