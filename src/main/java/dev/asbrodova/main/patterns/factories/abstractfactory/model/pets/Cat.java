package dev.asbrodova.main.patterns.factories.abstractfactory.model.pets;

import dev.asbrodova.main.patterns.factories.Animal;

public class Cat  implements Animal {

    @Override
    public void initialize() {
        System.out.println("Please, pet the cat!");
    }
}
