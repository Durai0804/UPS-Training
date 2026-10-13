import java.util.*;
class carnivore{
    String animal;
    int animalId;
    public void food(){
        System.out.println("all the carnivores eat meat");
    }
    public void sound(){
        System.out.println("All animals makes sound");
    }

    carnivore(String animal, int animalId){
        this.animal = animal;
        this.animalId = animalId;
    }

}

class lion extends carnivore{
    lion(String animal , int animalId){
        super(animal , animalId);
    }
    public void sound(){
        System.out.println("the current animals is :" + animal + " and its animal Id is " + animalId + "and its sound is roar");
    }
}

public class inheritance{
    public static void main(String[] args){
        lion l = new lion("lion",28);
        l.sound();
        l.food();
    }
}