package dev.asbrodova.main;

import dev.asbrodova.main.patterns.factories.Animal;
import dev.asbrodova.main.patterns.factories.abstractfactory.impl.AbstractAnimalFactory;
import dev.asbrodova.main.patterns.factories.abstractfactory.impl.AnimalFactoryProducer;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.TypeOfAnimal;
import dev.asbrodova.main.patterns.factories.factory.impl.AnimalFactory;
import dev.asbrodova.main.patterns.factories.factory.model.AnimalType;
import dev.asbrodova.main.patterns.singleton.EarlySingleton;
import dev.asbrodova.main.patterns.singleton.LazySingleton;
import dev.asbrodova.main.patterns.singleton.SerializableSingleton;

import java.io.*;

public class PatternsDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // FACTORY PATTERN DEMO
        AnimalFactory animalFactory = new AnimalFactory();
        Animal bird = animalFactory.getAnimal(AnimalType.BIRD);
        Animal fish = animalFactory.getAnimal(AnimalType.FISH);
        Animal cat = animalFactory.getAnimal(AnimalType.CAT);

        bird.initialize();
        fish.initialize();
        cat.initialize();


        //ABSTRACT FACTORY PATTERN DEMO
        AbstractAnimalFactory wildFactory = AnimalFactoryProducer.getFactory(true);
        Animal eagle = wildFactory.getAnimal(TypeOfAnimal.BIRD);
        Animal tiger = wildFactory.getAnimal(TypeOfAnimal.CAT);

        AbstractAnimalFactory petFactory = AnimalFactoryProducer.getFactory(false);
        Animal parrot = petFactory.getAnimal(TypeOfAnimal.BIRD);
        Animal kitty = petFactory.getAnimal(TypeOfAnimal.CAT);

        eagle.initialize();
        tiger.initialize();
        parrot.initialize();
        kitty.initialize();

        //SINGLETON DEMO: EARLY, LAZY AND SERIALIZED
        EarlySingleton.ifInitialized();

        LazySingleton.ifInitialized();
        LazySingleton.getInstance();
        LazySingleton.ifInitialized();

        SerializableSingleton serializableSingleton1 = SerializableSingleton.getInstance();
        ObjectOutput out = null;

        // Serialize object state to file
        out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(serializableSingleton1);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializableSingleton serializableSingleton2 = (SerializableSingleton) in.readObject();
        in.close();

        System.out.println("Is singleton object is the same before and after serialization/deserialization? "
                + (serializableSingleton1.hashCode() == serializableSingleton2.hashCode()));

    }
}
