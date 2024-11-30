package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();


        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", 90000, "/1/1084.jpg","abc", "Roger Alers", 87, "/2/3.mp3");
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King2",
                "Animation2", 50000, "/1/1085.jpg","abc",  "Roger Alers",87, "/2/3.mp3");
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.removeDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King3",
                "Animation3", 70000, "/1/1086.jpg","abc", "Roger Alers", 87, "/2/3.mp3");
        anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc[] dvdList = {dvd1, dvd2};
        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.addDigitalVideoDisc(dvd3, dvd2, dvd1);
        anOrder.addDigitalVideoDisc(dvd1, dvd2);


        // Print total cost of the items in the cart
        System.out.println("Total Price is: ");
        System.out.println(anOrder.totalPrice());
    }
}