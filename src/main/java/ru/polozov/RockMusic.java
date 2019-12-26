package ru.polozov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {
    private List<String> list = new ArrayList<>(Arrays.asList("We are the champion", "Wind of change", "Numb"));

    @Override
    public List<String> getSong() {
        return list;
    }
}
