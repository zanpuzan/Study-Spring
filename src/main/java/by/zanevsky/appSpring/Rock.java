package by.zanevsky.appSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Rock implements Music {

    List<String> songList = new ArrayList<String>(){{
        add("Highway to Hell");
        add("The Show Must Go On");
        add("The Unforgiven");
    }};

    private int songNumber() {
        Random random = new Random();
        return random.nextInt(3);
    }
    @Override
    public String getSong() {
        return songList.get(songNumber());
    }
}
