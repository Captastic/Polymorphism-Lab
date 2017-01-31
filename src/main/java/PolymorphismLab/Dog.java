package PolymorphismLab;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class Dog extends Pet {


    Dog(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Woof";
    }
}
