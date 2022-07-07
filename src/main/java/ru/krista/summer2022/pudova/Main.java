package ru.krista.summer2022.pudova;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int earth = Integer.parseInt(args[0]);
        int water = Integer.parseInt(args[1]);
        boolean barrier = "да".equals(args[2]);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Horse());
        animals.add(new Turtle());
        animals.add(new Fish());

        for (Animal animal : animals) {
            animal.timePath(earth, water, barrier);
        }

        animals = animals.stream().sorted((Comparator.comparingDouble(Animal::getTimePath))).collect(Collectors.toList());


        for (Animal animal : animals) {
            if (animal.getTimePath() < 0) {
                System.out.println(animal.getAnimalType() + " не может завершить дистанцию");
            } else {
                System.out.println(animal.getAnimalType() + " " + animal.getTimePath() + " минут");
            }
        }
    }
}
