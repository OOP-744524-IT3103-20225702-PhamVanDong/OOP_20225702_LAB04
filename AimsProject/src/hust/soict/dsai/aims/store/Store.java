package hust.soict.dsai.aims.store;


import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<Media>  items = new ArrayList<Media>();;
    
    public void addDigitalVideoDisc( Media... media) {
        Collections.addAll(items, media);
    }

    public void removeDigitalVideoDisc(Media media) {
        items.remove(media);
    }

}
