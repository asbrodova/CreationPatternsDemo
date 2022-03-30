package dev.asbrodova.main.patterns.factories.abstractfactory.impl;

import dev.asbrodova.main.patterns.factories.Animal;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.TypeOfAnimal;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.wild.Eagle;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.wild.Tiger;

public class WildFactory implements AbstractAnimalFactory {

    @Override
    public Animal getAnimal(TypeOfAnimal typeOfAnimal) {
        switch (typeOfAnimal) {
            case BIRD:
                return new Eagle();
            case CAT:
                return new Tiger();
            default:
                return null;
        }
    }
}
