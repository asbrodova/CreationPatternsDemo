package dev.asbrodova.main.patterns.factories.abstractfactory.impl;

public class AnimalFactoryProducer {

    public static AbstractAnimalFactory getFactory(boolean isWild) {
        return isWild ? new WildFactory() : new PetFactory();

    }
}
