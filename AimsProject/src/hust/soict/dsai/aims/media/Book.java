package dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    private static int nbBooks = 0;

    //Get And Set




    //Constructor
    public Book(int id, String title, String category, float price, List<String> authors) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
        this.authors = authors;
        nbBooks++;
    }

    public void AddAuthor(String ... author){
        for (String a : author){
            if (!authors.contains(a)) authors.add(a);
        }
    }

    public void RemoveAuthor(String ... author){
        for (String a : author){
            if (authors.contains(a)) authors.remove(a);
            else System.out.println("Book "+id+" does not have author " + a);
        }
    }



}
