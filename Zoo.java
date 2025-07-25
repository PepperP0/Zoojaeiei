import java.util.ArrayList;
import java.util.List;

import Lib.Animal;
import Lib.Dolphin;
import Lib.Eagle;
import Lib.Flyable;
import Lib.Lion;
import Lib.Penguin;
import Lib.Swimable;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>() ;

        animals.add(new Lion("Boat"));
        animals.add(new Eagle("Owen"));
        animals.add(new Penguin("Auto"));
        animals.add(new Dolphin("Get"));

        for (Animal zoo: animals ){
            System.out.println(zoo.getName());
            System.out.println(zoo.makeSound());
        }

        for (Animal zoo : animals ){
            if (zoo instanceof Flyable){
                System.out.println((zoo).getName()+" can fly "+((Flyable)zoo).fly());
            }else if (zoo instanceof Swimable){
                System.out.println((zoo).getName()+" can swim "+((Swimable)zoo).swim());
            }else 
            System.out.println((zoo).getName()+ " walking at zoo ");
        }
        
    }

}