package PolymorphismLab;

import java.util.ArrayList;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class PetWarehouse {
    private int numberOfPets;
    protected PetGenerator petGenerator = new PetGenerator();
    protected ArrayList<Pet> pets = new ArrayList<>();

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public Pet getPetFromList(int i){
       return pets.get(i);
    }

    public void addPetToList(String name, String type){
        pets.add(petGenerator.createPet(name, type));

    }
}