package dev.asbrodova.main.patterns.factories.abstractfactory.model.pets;

import dev.asbrodova.main.patterns.factories.Animal;

public class Parrot implements Animal {

    @Override
    public void initialize() {
        System.out.println("Say \"Hi\" to the parrot!");
    }
}
