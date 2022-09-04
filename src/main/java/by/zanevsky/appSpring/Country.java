package by.zanevsky.appSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Country implements Music{

    List<String> songList = new ArrayList<String>(){{
        add("I Walk the Line");
        add("Mama's Hungry Eyes");
        add("He Stopped Loving Her Today");
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
