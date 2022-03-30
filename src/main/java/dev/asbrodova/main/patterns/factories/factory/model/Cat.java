package dev.asbrodova.main.patterns.factories.factory.model;

import dev.asbrodova.main.patterns.factories.Animal;

public class Cat  implements Animal {

    @Override
    public void initialize() {
        System.out.println("I am a cat");
    }
}
