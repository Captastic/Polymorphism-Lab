package PolymorphismLab;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest {

    Dog dog;

    @Test
    //Testing speak for Dog class
    public void speakTest() {
        dog = new Dog("Woof");
        String expected = "Woof";
        String actual = dog.speak();
        assertEquals("testing speak for dog", expected, actual);
    }

    @Test
    //testing name parameter for Dog creation
    public void nameTest(){
        dog = new Dog("dag");
        String expected = "dag";
        String actual = dog.getPetName();
        assertEquals("testing name for dog", expected, actual);
    }
}
