package dev.asbrodova.main.patterns.factories.abstractfactory.impl;

import dev.asbrodova.main.patterns.factories.Animal;
import dev.asbrodova.main.patterns.factories.abstractfactory.model.TypeOfAnimal;

public interface AbstractAnimalFactory {

    Animal getAnimal(TypeOfAnimal typeOfAnimal);

}
