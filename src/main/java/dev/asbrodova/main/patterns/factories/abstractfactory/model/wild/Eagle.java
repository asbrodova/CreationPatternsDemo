package dev.asbrodova.main.patterns.factories.abstractfactory.model.wild;


import dev.asbrodova.main.patterns.factories.Animal;

public class Eagle implements Animal {

    @Override
    public void initialize() {
        System.out.println("Eagle is here!");
    }
}
