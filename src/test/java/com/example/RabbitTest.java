package com.example;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class RabbitTest {

    @Test
    public void eatGrassTest() throws Exception {
        Rabbit rabbit = new Rabbit();
        List<String> actual = rabbit.eatGrass();
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() {
        Rabbit rabbit = new Rabbit();
        String actual = rabbit.getFamily();
        String expected = "Зайцевых";
        assertEquals(expected, actual);
    }

    @Test
    public void getBunniesTest() {
        Rabbit rabbit = new Rabbit();
        int actual = rabbit.getBunnies();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void getBunniesParamsTest() {
        Rabbit rabbit = new Rabbit();
        int actual = rabbit.getBunnies(8);
        int expected = 8;
        assertEquals(expected, actual);
    }
}
