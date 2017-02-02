package PolymorphismLab;

/**
 * Created by anthonycapriotti on 2/1/17.
 */
import org.junit.Before;
import org.junit.Test;

import javax.print.DocFlavor;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class PetComparatorTest {
    PetComparator petComparator = new PetComparator();
    Pet pet1, pet2;



    @Test
    //testing the comparator of two pet objects
    public void compareTest(){
        Dog dog = new Dog("Dag");
        Cat cat = new Cat("Fluffy");
        int expected = 1;
        int actual = petComparator.compare(dog, cat);
        assertEquals("These are different", expected, actual);

    }


}
