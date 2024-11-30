package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String Artist;
    private List<Track> tracks = new ArrayList<Track>();


    //Getter
    public String getArtist() {
        return Artist;
    }


    //Constructor
    public CompactDisc(int id, String title, String category, float price, String director, int length, String artist, List<Track> tracks) {
        super(id, title, category, price, director, length);
        Artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(int id, String title, String artist, List<Track> tracks) {
        super(id, title);
        Artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(int id, String title, String category, float price, String artist, List<Track> tracks) {
        super(id, title, category, price);
        Artist = artist;
        this.tracks = tracks;
    }

    //
    public void addTrack(Track ... trackList){
        for(Track track : trackList) {
            if (!tracks.contains(track)) tracks.add(track);
        }
    }

    public void removeTrack(Track ... trackList){
        for(Track track : trackList) {
            if (tracks.contains(track)) tracks.remove(track);
            else System.out.println("TrackList "+ getId() +" does not have track " + track.getTitle());
        }
    }

    public int getLength(){
        int length = 0;
        for(Track track : tracks){
            length+= track.getLength();
        }
        return length;
    }

}
