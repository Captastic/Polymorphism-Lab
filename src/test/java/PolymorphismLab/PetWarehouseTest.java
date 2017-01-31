package PolymorphismLab;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class PetWarehouseTest {
    PetWarehouse warehouse;

    @Test
    //testing adding pet and getting pet from arraylist
    public void addGetNewPetToArrayTest(){
        warehouse = new PetWarehouse();
        warehouse.addPetToList("Henry", "Turtle");
        String expected = "generic noise";
        String actual = warehouse.getPetFromList(0).speak();
        assertEquals("testing adding pet to list by getting speak method", expected, actual);
    }

    @Test
    //adding object dog to arraylist
    public void AddingDogToArrayList(){
        warehouse = new PetWarehouse();
        warehouse.addPetToList("Henry", "Dog");
        String expected = "Woof";
        String actual = warehouse.getPetFromList(0).speak();
        assertEquals("testing adding specific pet to array list and being able to get it from list", expected, actual);
    }
}
