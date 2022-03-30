package dev.asbrodova.main.patterns.factories.abstractfactory.model.wild;

import dev.asbrodova.main.patterns.factories.Animal;

public class Tiger  implements Animal {

    @Override
    public void initialize() {
        System.out.println("Tiger is here!");
    }
}
