package ru.geekbrains.lesson3;

import java.awt.*;

public class SportCar extends Car implements Fueling, Wiping {
    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(3);
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void fuel(FuelType fuelType) {
        System.out.println("Заправлено топливо: "+fuelType);
    }

    @Override
    public void wipMirrors() {
        System.out.println("Зеркала заднего вида вымыты. Даже в салоне.");
    }

    @Override
    public void wipWindshield() {
        System.out.println("То, что осталось от лобового стелка вымыто.");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Фары якобы вымыты.");

    }
}
