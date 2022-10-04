package org.example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Cat {

    public String name;
    public String colour;
    public int age;

    public Cat(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}

class Dog {
    public String name;
    public String colour;
    public int age;

    public Dog(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}

public class BoundedGenerics {

    public static void main(String[] args) {
        BoundedGenerics generics = new BoundedGenerics();
        List petList = new ArrayList();
        Cat mittens = new Cat("Mittens","Black",15);
        Dog sparky = new Dog("Sparky","Brown",5);
        Cat paws = new Cat("Paws","White",2);
        Dog buzz = new Dog("Buzz","Yellow",5);

        petList = generics.addToList(petList,mittens);
        petList = generics.addToList(petList,sparky);

        System.out.println("Cat added: " + petList.get(0).toString());
        System.out.println("Dog added: " + petList.get(1).toString());

        // Not allowed as Sparky is not a cat, and does not extend the Cat class
        // petList = generics.addCatToList(petList,sparky);
        petList = generics.addCatToList(petList,paws);

        // Not allowed as Paws is not a dog, and does not extend the Dog class
        // petList = generics.addDogToList(petList,paws);
        petList = generics.addDogToList(petList,buzz);

        System.out.println("Cat added: " + petList.get(2).toString());
        System.out.println("Dog added: " + petList.get(3).toString());

        petList = generics.removeFromList(petList,paws);
        petList = generics.removeFromList(petList,mittens);

        System.out.println("Dog stays on list: " + petList.get(0).toString());
        System.out.println("Dog stays on list: " + petList.get(1).toString());
    }

    public <T> List<T> addToList(List<T> petList, T pet) {
        petList.add(pet);
        return petList;
    }

    public <T extends Cat> List<T> addCatToList(List<T> petList, T pet) {
        petList.add(pet);
        return petList;
    }

    public <T extends Dog> List<T> addDogToList(List<T> petList, T pet) {
        petList.add(pet);
        return petList;
    }

    public <T> List<T> removeFromList(List<T> petList, T pet) {
        petList.remove(pet);
        return petList;
    }
}
