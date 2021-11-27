package com.example;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    private LionAlex lionAlex;

    @Before
    public void initObject() throws Exception {
        lionAlex = new LionAlex();
    }

    @Test
    public void getKittensTest() {
        int actual = lionAlex.getKittens();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensParamsTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() {
        String actual = lionAlex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, actual);
    }

    @Test
    public void getFriendsTest() {
        List<String> actual = lionAlex.getFriends();
        List<String> expected = List.of("Глория", "Мелман", "Марти");
        assertEquals(expected, actual);
    }
}
