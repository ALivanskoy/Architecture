package ru.geekbrains.lesson1.store3D.InMemoryModel;

public interface ModelChanger {

    /**
     * Произошло изменение в хранилище моделей
     */
    void notifyChange();
    void RegisterModelChanger(ModelChangedObserver o);
    void RemoveModelChanger(ModelChangedObserver o);

}
