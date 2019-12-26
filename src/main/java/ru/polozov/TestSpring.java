package ru.polozov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();
        musicPlayer.playMusic();

        context.close();
    }
}
