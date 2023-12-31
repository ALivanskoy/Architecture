package ru.geekbrains.lesson3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {


    private Refueling refueling;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel(FuelType fuelType) {
        System.out.println("Заправлено топливо: "+fuelType);
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

    // Подметать
    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }





    @Override
    public void wipMirrors() {
        System.out.println("Зеркала вымыты");

    }

    @Override
    public void wipWindshield() {

        System.out.println("Лобовуха вымыта");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Фары вымыты");

    }


}
