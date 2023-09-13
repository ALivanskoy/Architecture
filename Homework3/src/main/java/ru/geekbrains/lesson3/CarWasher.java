package ru.geekbrains.lesson3;

public class CarWasher<T extends Car> {

    private static CarWasher carWasher;

    private CarWasher () {

    }

    public static CarWasher getCarWasher () {

        if (carWasher == null) {
            carWasher = new CarWasher<Car>();
        }

        return carWasher;
    }

    public void washCar (Wiping car) {
        car.wipHeadlights();
        car.wipMirrors();
        car.wipWindshield();
    }
}
