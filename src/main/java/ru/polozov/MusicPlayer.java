package ru.polozov;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private List<Music> list = new ArrayList<>();
    {
        list.add(new ClassicalMusic());
        list.add(new RockMusic());
        list.add(new RapMusic());
    }

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> list) {
        this.list = list;
    }

    public void playMusic() {
        Random random = new Random();
        int randomNumberforGenre = random.nextInt(3);
        int randomNumberforSong = random.nextInt(3);
        System.out.println(list.get(randomNumberforGenre).getSong().get(randomNumberforSong));
    }
}
