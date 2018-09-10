package base.animal_classes;

import base.interfaces.Animal;

/**
 * Абстрактный класс присмыкающихся.
 *
 * @author Yan Teppe
 */
public abstract class Reptiles implements Animal {
    protected String name = "Присмыкающееся";

    public void breathe() {
        System.out.println(name + "дышит лёгкими");
    }

    public void move() {
        System.out.println(name + "ползает");
    }

    public void makeSound() {
        System.out.println(name + "издаёт звук");
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName(){
        return name;
    }
}
