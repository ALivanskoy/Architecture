package ru.geekbrains.lesson1.store3D.InMemoryModel;

public class Observer1 implements ModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - observer#1");
    }
}
