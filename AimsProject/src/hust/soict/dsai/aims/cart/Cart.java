package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println( disc.getTitle());
        }
    }

    /*public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = digitalVideoDisc;
                qtyOrdered++;
                System.out.println( digitalVideoDisc.getTitle());
            } else {
                System.out.println("Can't add DVD " + digitalVideoDisc.getTitle() + " because qtyOrder > " + MAX_NUMBERS_ORDERED);
            }
        }
    }*/
    public void addDigitalVideoDisc( DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = digitalVideoDisc;
                qtyOrdered++;
                System.out.println( digitalVideoDisc.getTitle());
            } else {
                System.out.println("Can't add DVD " + digitalVideoDisc.getTitle() + " because qtyOrder > " + MAX_NUMBERS_ORDERED);
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println( dvd1.getTitle());
        }if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println( dvd2.getTitle());
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (disc == itemsOrdered[i]){
                for (int j = i; j < qtyOrdered -1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                break;
            }
        }

    }

    public float totalPrice() {
        int total = 0;
        for(int i = 0; i < qtyOrdered; i++) total += itemsOrdered[i].getPrice();
        return total;
    }

    public void print (){
        System.out.println("***********************CART***********************" +
                "\nOrdered Items:");
        for (int i = 0; i < qtyOrdered; i++){
            System.out.println(itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getPrice());
        }
        System.out.println("Total cost: " + totalPrice() +
                "\n**************************************************");
    }

    public boolean find(String title){
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].getTitle() == title) return true;
        }
        return false;
    }

}