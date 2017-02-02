package PolymorphismLab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class Input_Output {

    static Scanner scanner = new Scanner(System.in);

    public int userNumberOfPets(){
        System.out.println("Enter the number of pets");
       return scanner.nextInt();
    }

    public  String userTypeOfPets(){
        System.out.println("What type of pet is this?");
        return scanner.next();
    }

    public  String  userNameOfPets(){
        System.out.println("What is this pets name?");
        return scanner.next();
    }

    public  void printListOfPets(ArrayList<Pet> petArrayList){
        for (Pet p : petArrayList){
            System.out.println(p.getPetName() + " -he/she says " + p.speak());
        }

    }


}
