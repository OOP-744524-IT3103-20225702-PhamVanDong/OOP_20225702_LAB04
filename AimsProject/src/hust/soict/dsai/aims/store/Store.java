package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<DigitalVideoDisc>  items;

    public Store() {
        this.items = new ArrayList<>();
    }

    public void addDigitalVideoDisc( DigitalVideoDisc... dvdList) {
        Collections.addAll(items, dvdList);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        items.remove(disc);
    }

}
