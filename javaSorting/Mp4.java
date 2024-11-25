package javaSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Mp4 {
    public static void main(String[] args) {
     Song song1 = new Song("jab we met","sarukan",2004);
        Song song2 = new Song("jab we met1","sarukan1",20043);
        Song song3 = new Song("jab we met2","sarukan2",20046);
        Song song4 = new Song("jab we met3","sarukan3",20045);

        ArrayList<Song> musicList = new ArrayList<>();
        musicList.add(song1);
        musicList.add(song2);
        musicList.add(song3);
        musicList.add(song4);
        MyUtils.iterateList(musicList);
        Collections.sort(musicList);
    }
}
