package PolymorphismLab;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class DinoTest {

    Dino dino;

    @Test
    //speak method for dino class
    public void speakTest(){
        dino = new Dino("dino");
        String expected = "Roar";
        String actual = dino.speak();
        assertEquals("testing speak test for dino class", expected, actual);
    }

    @Test
    //testing name parameter from dinosaur constructor
    public void nameTest(){
        dino = new Dino("dino");
        String expected = "Roar";
        String actual = dino.speak();
        assertEquals("testing dino name", expected, actual);
    }
}
