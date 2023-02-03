package circus;

import circus.animals.Animal;
import circus.animals.Bird;
import circus.animals.Duck;
import circus.animals.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        // upcasting (references to the duck, hence underlying object is still duck and "Quacks")
        Bird b = (Bird) d;
        getToSpeak(b);

        // the casting is greyed out because upcasting is redundant
        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        train(new Parrot());

        //Animal a2 = new Animal();
        //Bird b2 = new Bird();

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        // not wrong but a bad practice if the code is written by you
        // but if youre using a library from others and you want to customise their methods
        // then you can use instanceof
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("Not a duck!");
        }
    }
}
