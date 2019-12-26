package ru.polozov;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ClassicalMusic implements Music {
    private List<String> list = new ArrayList<>(Arrays.asList("Vivaldy symphony #1", "Vivaldy symphony #2", "Vivaldy symphony #3"));

    @Override
    public List<String> getSong() {
        return list;
    }
}
