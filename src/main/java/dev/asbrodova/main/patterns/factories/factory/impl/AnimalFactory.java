package dev.asbrodova.main.patterns.factories.factory.impl;

import dev.asbrodova.main.patterns.factories.Animal;
import dev.asbrodova.main.patterns.factories.factory.model.*;

public class AnimalFactory {

    public Animal getAnimal(AnimalType animalType) {
        switch (animalType) {
            case BIRD:
                return new Bird();
            case FISH:
                return new Fish();
            case CAT:
                return new Cat();
            default:
                return null;
        }
    }
}
