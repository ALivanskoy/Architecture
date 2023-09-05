package ru.geekbrains.lesson1.store3D.ModelElements;

import java.util.List;

public class Scene {

    private int id;
    private List<PoligonalModel> poligonalModels;
    private List<Flash> flashs;
    
    public Scene(int id, List<PoligonalModel> poligonalModels, List<Flash> flashs) {
        this.id = id;
        this.poligonalModels = poligonalModels;
        this.flashs = flashs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PoligonalModel> getPoligonalModels() {
        return poligonalModels;
    }

    public void setPoligonalModels(List<PoligonalModel> poligonalModels) {
        this.poligonalModels = poligonalModels;
    }

    public List<Flash> getFlashs() {
        return flashs;
    }

    public void setFlashs(List<Flash> flashs) {
        this.flashs = flashs;
    }

    
    

}
