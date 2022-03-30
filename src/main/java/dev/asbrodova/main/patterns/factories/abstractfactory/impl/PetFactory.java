package dev.asbrodova.main.patterns.factories.abstractfactory.impl;

import dev.asbrodova.main.patterns.factories.Animal;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.TypeOfAnimal;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.pets.Cat;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.pets.Parrot;

public class PetFactory implements AbstractAnimalFactory {

    @Override
    public Animal getAnimal(TypeOfAnimal typeOfAnimal) {
        switch (typeOfAnimal) {
            case BIRD:
                return new Parrot();
            case CAT:
                return new Cat();
            default:
                return null;
        }
    }
}
