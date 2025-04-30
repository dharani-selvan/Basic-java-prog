import java.util.ArrayList;
import java.util.List;

// Superclass Animal
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Mammal
class Mammal extends Animal {
    @Override
    public void sound() {
        System.out.println("Some mammal sound");
    }
}

// Subclass Dog extending Mammal
class Dog extends Mammal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

public class generic {
    
    // Upper Bounded Method: Accepts Animal or any subclass of Animal
    public static void printAnimalSounds(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }
    
    // Lower Bounded Method: Accepts Dog or any superclass of Dog
    public static void addDogToList(List<? super Dog> animals) {
        animals.add(new Dog());  // Allowed to add Dog because of ? super Dog
    }
    
    public static void main(String[] args) {
        // Create lists of different types
        List<Animal> animals = new ArrayList<>();
        List<Mammal> mammals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        
        // Add some sample objects
        animals.add(new Animal());
        mammals.add(new Mammal());
        dogs.add(new Dog());
        
        // Upper Bound Example: print sounds of Animal and subclasses
        System.out.println("Printing animal sounds:");
        printAnimalSounds(animals); // Works with List<Animal>
        printAnimalSounds(mammals); // Works with List<Mammal>
        printAnimalSounds(dogs);    // Works with List<Dog>
        
        // Lower Bound Example: add dogs to lists with Dog or superclasses
        System.out.println("\nAdding dogs to lists:");
        addDogToList(animals);      // Works with List<Animal>
        addDogToList(mammals);      // Works with List<Mammal>
        addDogToList(dogs);         // Works with List<Dog>
        
        // Print updated lists to show that dogs were added
        System.out.println("\nUpdated list of animals:");
        printAnimalSounds(animals);
        System.out.println("\nUpdated list of mammals:");
        printAnimalSounds(mammals);
        System.out.println("\nUpdated list of dogs:");
        printAnimalSounds(dogs);

    }
}
