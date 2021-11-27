package com.example;

import java.util.List;

public class Rabbit extends Animal implements Vegan {

    @Override
    public List<String> eatGrass() throws Exception {
        return getFood("Травоядное");
    }

    @Override
    public String getFamily() {
        return "Зайцевых";
    }

    public int getBunnies() {
        return getBunnies(8);
    }

    public int getBunnies(int bunniesCount) {
        return bunniesCount;
    }
}
