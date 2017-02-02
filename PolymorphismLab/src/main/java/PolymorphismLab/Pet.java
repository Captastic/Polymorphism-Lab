package PolymorphismLab;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class Pet implements Comparable<Pet> {
    String petName;

    Pet(){}

    Pet(String name){
        this.petName = name;

    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String speak(){
        return "generic noise";
    }

//new method
    @Override
    public int compareTo(Pet p) {
         return this.getPetName().compareTo(p.getPetName());
    }
}
