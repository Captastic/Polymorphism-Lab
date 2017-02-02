package PolymorphismLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by anthonycapriotti on 2/1/17.
 */
public class PetComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
       return pet1.getClass().toString().compareTo(pet2.getClass().toString());
    }




}
