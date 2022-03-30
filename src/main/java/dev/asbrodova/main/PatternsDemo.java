package dev.asbrodova.main;

import dev.asbrodova.main.patterns.factories.Animal;
import dev.asbrodova.main.patterns.factories.abstractfactory.impl.AbstractAnimalFactory;
import dev.asbrodova.main.patterns.factories.abstractfactory.impl.AnimalFactoryProducer;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.TypeOfAnimal;
import dev.asbrodova.main.patterns.factories.factory.impl.AnimalFactory;
import dev.asbrodova.main.patterns.factories.factory.model.AnimalType;

public class PatternsDemo {

    public static void main(String[] args) {

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

    }
}
