package by.zanevsky.appSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Classical implements Music {

    List<String> songList = new ArrayList<String>(){{
        add("Moonlight Sonata");
        add("Bohemian Rhapsody");
        add("Flight of the Bumblebee");
    }};

    private int songNumber() {
        Random random = new Random();
        return random.nextInt(3);
    }

    @Override
    public String getSong() {
        return songList.get(songNumber());
    }

//    private Classical () {}

//    public static Classical getClassical () {
//        return new Classical();
//    }

    public void doMyInit() {
        System.out.println("Initialization complete");
    }


    public void doMyDestroy() {
        System.out.println("Destruction complete");
    }

}
