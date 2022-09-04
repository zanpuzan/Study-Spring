package by.zanevsky.appSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(Genres.ROCK);
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

//        musicPlayer.setMusicList(context.getBean("classical", Classical.class));
//        musicPlayer.setMusicList(context.getBean("rock", Rock.class));
//        musicPlayer.setMusicList(context.getBean("country", Country.class));

//        musicPlayer.playMusicList();
//        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
