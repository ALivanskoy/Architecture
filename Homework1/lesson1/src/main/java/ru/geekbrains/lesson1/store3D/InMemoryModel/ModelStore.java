package ru.geekbrains.lesson1.store3D.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.lesson1.store3D.ModelElements.Camera;
import ru.geekbrains.lesson1.store3D.ModelElements.Flash;
import ru.geekbrains.lesson1.store3D.ModelElements.PoligonalModel;
import ru.geekbrains.lesson1.store3D.ModelElements.Scene;

public class ModelStore implements ModelChanger {

    private List<ModelChangedObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonalModel model){
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }
}
