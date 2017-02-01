package PolymorphismLab;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class Engine {
    PetWarehouse petWarehouse = new PetWarehouse();
    Input_Output input_output = new Input_Output();
    int numberOfAnimals = 0;
    String name;
    String type;

    public void run(){
        petWarehouse.numberOfPets = input_output.userNumberOfPets();
        for(int i = 0 ; i < petWarehouse.numberOfPets; i++){
            petWarehouse.addPetToList(input_output.userNameOfPets(), input_output.userTypeOfPets());
        }
        input_output.printListOfPets(petWarehouse.getPets());
    }

}
