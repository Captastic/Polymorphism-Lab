package PolymorphismLab;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class Cat extends Pet {

    Cat(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Meow";
    }
}
