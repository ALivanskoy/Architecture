package ru.geekbrains.lesson1.store3D;

import ru.geekbrains.lesson1.store3D.InMemoryModel.ModelStore;
import ru.geekbrains.lesson1.store3D.InMemoryModel.Observer1;
import ru.geekbrains.lesson1.store3D.ModelElements.Poligon;
import ru.geekbrains.lesson1.store3D.ModelElements.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);

        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add(poligonalModel);

    }

}
