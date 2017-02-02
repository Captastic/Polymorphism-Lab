package PolymorphismLab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by anthonycapriotti on 1/31/17.
 */

public class CatTest {

    Cat cat;

    @Test
    //Testing speak for cat class
    public void speakTest(){
        cat = new Cat("Meow");
        String expected = "Meow";
        String actual = cat.speak();
        assertEquals("Meow", expected, actual);
    }

    @Test
    //testing name parameter for cat creation
    public void nameTest(){
        cat = new Cat("cat");
        String expected = "cat";
        String actual = cat.getPetName();
        assertEquals("cat", expected, actual);
    }
}
