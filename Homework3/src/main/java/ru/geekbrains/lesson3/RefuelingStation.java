package ru.geekbrains.lesson3;

public class RefuelingStation implements Refueling {

    private static RefuelingStation refuelingStation;
    private RefuelingStation (){}

    public static RefuelingStation getRefuelingStation() {
        if (refuelingStation == null) {
            refuelingStation = new RefuelingStation();
        }
        return refuelingStation;
    }
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }

    public void fuelDiesel (Fueling something) {
        something.fuel(FuelType.Diesel);
    }

    public void fuelGas (Fueling something) {
        something.fuel(FuelType.Gasoline);
    }
}
