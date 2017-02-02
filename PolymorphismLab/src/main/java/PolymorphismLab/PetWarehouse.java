package PolymorphismLab;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class PetWarehouse {
    int numberOfPets;
    protected PetGenerator petGenerator = new PetGenerator();
    protected ArrayList<Pet> pets = new ArrayList<>();
    private PetComparator comparator = new PetComparator();

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public Pet getPetFromList(int i){
       return pets.get(i);
    }

    public void addPetToList(String name, String type){
        pets.add(petGenerator.createPet(name, type));
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    String returnListAsString (ArrayList<Pet> petsList){
        String listAsString = "";
        for (Pet p : petsList){
           listAsString = listAsString.concat(p.getPetName() + " " + p.getClass().getSimpleName() + "\n");
        }
        return listAsString;

    }


   public ArrayList<Pet> sortListByName(ArrayList<Pet> pets){
        Collections.sort(pets);
        return pets;

    }

    public ArrayList<Pet> sortListByType (ArrayList<Pet> pets){
        Collections.sort(pets,comparator );
        return pets;
    }
}