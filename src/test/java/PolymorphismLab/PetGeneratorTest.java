package PolymorphismLab;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PetGeneratorTest {
    PetGenerator petGenerator;


    @Test
    //testing name generic pet generation
    public void petGeneratorNameTest(){
        petGenerator = new PetGenerator();
        Pet henry = petGenerator.createPet("Henry", "Dog");
        String expected = "Henry";
        String actual = henry.getPetName();
        assertEquals("Testing petgen name", expected, actual);
    }

    @Test
    //Testing dog object creation by creating then ca,ling speak method showing successful dog creation
    public void dogGeneratorTest(){
        petGenerator = new PetGenerator();
        Pet henry = petGenerator.createPet("Henry","Dog");
        String expected = "Woof";
        String actual = henry.speak();
        assertEquals("testing dog creation", expected, actual);
    }

    @Test
    //testing car object creation by creating then calling speak method from cat class showing cat creation
    public void catGeneratorTest(){
        petGenerator = new PetGenerator();
        Pet horatio = petGenerator.createPet("Horatio", "Cat");
        String expected = "Meow";
        String actual = horatio.speak();
        assertEquals("testing cat generation", expected, actual);
    }

    @Test
    //Testing dino object creation by creating then calling speak method from dino class showing dino creation
    public void dinoGeneratorTest(){
        petGenerator = new PetGenerator();
        Pet dino = petGenerator.createPet("Dino", "Dinosaur");
        String expected = "Roar";
        String actual = dino.speak();
        assertEquals("testing do generation", expected, actual);
    }



}
