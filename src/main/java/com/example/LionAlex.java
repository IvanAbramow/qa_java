package com.example;
import java.util.List;

public class LionAlex extends Lion {

    private static final Feline feline = new Feline();
    public LionAlex() throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    public List<String> getFriends(){
        return List.of("Глория", "Мелман", "Марти");
    }
}
