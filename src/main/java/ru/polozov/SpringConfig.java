package ru.polozov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> list() {
        List<Music> listMusic = new ArrayList<>();
        listMusic.add(new ClassicalMusic());
        listMusic.add(new RockMusic());
        listMusic.add(new RapMusic());
        return listMusic;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(list());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
