package by.zanevsky.appSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    @Autowired
    @Qualifier ("classical")
    private Music music1;

    @Autowired
    @Qualifier ("rock")
    private Music music2;

    @Autowired
    @Qualifier ("country")
    private Music music3;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer() {
    }


//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public void setMusicList(Music music) {
        musicList.add(music);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic (Genres genres) {
        switch (genres){
            case CLASSICAL:
                System.out.println("Genre: " + Genres.CLASSICAL + '\n' +
                                   "Playing: " + music1.getSong());
                break;
            case ROCK:
                System.out.println("Genre: " + Genres.ROCK + '\n' +
                        "Playing: " + music2.getSong());
                break;
            case COUNTRY:
                System.out.println("Genre: " + Genres.COUNTRY + '\n' +
                        "Playing: " + music3.getSong());
                break;
        }
    }

    public void playMusicList () {
        musicList.forEach(music -> System.out.println("Playing: " + music.getSong()));
    }

}
