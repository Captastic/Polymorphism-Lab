package PolymorphismLab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by anthonycapriotti on 1/31/17.
 */


public class PetTest {
   Pet pet = new Pet();
   Pet pet1 = new Pet();

   @Test
   //testing base speak method call
   public void speak(){
      pet = new Pet();
      String expected = "Bow wow";
      String actual = pet.speak();
      assertEquals("testing speak method", expected, actual);

   }

   @Test
   //testing pet constuctor with no arguments being passed
   public void noArgsConstructor(){
      pet= new Pet();
      String expected = null;
      String actual = pet.getPetName();
      assertEquals("testing no arg constructor", expected, actual);
   }

   @Test
   //testing pet contructor with arguements being passed
   public void nameArgsConstructor(){
      pet= new Pet("dog");
      String expected = "dog";
      String actual = pet.getPetName();
      assertEquals("testing named constructor", expected, actual);
   }

   @Test
   //testing overided compare method from comparator
   public void compareToTest(){
     pet = new Pet("aa");
     pet1 = new Pet("aa");
     int expected = 0;
     int actual =pet.compareTo(pet1);
     assertEquals("testing lexicographically comparison", expected, actual);
   }





}
