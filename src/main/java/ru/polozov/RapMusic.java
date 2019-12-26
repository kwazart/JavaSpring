package ru.polozov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RapMusic implements Music {
    private List<String> list = new ArrayList<>(Arrays.asList("Rap God", "Lose yourself", "Mockinbird"));

    @Override
    public List<String> getSong() {
        return list;
    }
}
