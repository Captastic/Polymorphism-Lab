package PolymorphismLab;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class PetWarehouseTest {
    ArrayList<Pet> sortedList = new ArrayList<>();
    PetWarehouse warehouse;

    @Before
    public void setup(){
        Dog dog = new Dog("dag");
        Cat cat = new Cat("cat");
        Dino dino = new Dino("dino");
        Cat cat1 = new Cat("fluffy");
        sortedList.add(dog);
        sortedList.add(cat);
        sortedList.add(dino);
        sortedList.add(cat1);
    }

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

    @Test
    public void sortingByNameTest(){
        warehouse = new PetWarehouse();
        String expected = "cat Cat\ndag Dog\ndino Dino\nfluffy Cat\n";
        warehouse.sortListByName(sortedList);
        String actual =warehouse.returnListAsString(sortedList);
        assertEquals("returns sorted list by names", expected, actual);
    }

    @Test
    public void sortingByTypeTest(){
        warehouse = new PetWarehouse();
        String expected = "cat Cat\nfluffy Cat\ndino Dino\ndag Dog\n";
        warehouse.sortListByType(sortedList);
        String actual = warehouse.returnListAsString(sortedList);
        assertEquals("This shit should work", expected, actual);

    }


}
