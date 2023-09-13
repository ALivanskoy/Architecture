package ru.geekbrains.lesson3;

import java.awt.*;
import java.sql.Ref;

public class FlyCar extends Car implements Fueling, Wiping {
    public FlyCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    private void fly(){
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
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
        System.out.println("Отражающие поверхности вымыты");

    }

    @Override
    public void wipWindshield() {

        System.out.println("Лобовое стекло вымыто");

    }

    @Override
    public void wipHeadlights() {
        System.out.println("Осветительные приборы вымыты");

    }
}
