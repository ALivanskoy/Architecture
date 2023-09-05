package ru.geekbrains.lesson1.store3D.ModelElements;

public class Location {

    private Point3D point3d;

    public Point3D getPoint3d() {
        return point3d;
    }

    public void setPoint3d(Point3D point3d) {
        this.point3d = point3d;
    }

    public Location () {
        this.point3d = new Point3D(0, 0, 0);
    }
    
}
