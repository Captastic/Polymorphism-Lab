package PolymorphismLab;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class Pet {
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
}
