package PolymorphismLab;

/**
 * Created by anthonycapriotti on 1/31/17.
 */
public class Dino extends Pet {

    Dino(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Roar";
    }
}
