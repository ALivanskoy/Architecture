package ru.geekbrains.lesson1.store3D.ModelElements;

public class Camera {

    private Location location;
    private Angle3D angle3d;
    public Camera(Location location, Angle3D angle3d) {
        this.location = location;
        this.angle3d = angle3d;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public Angle3D getAngle3d() {
        return angle3d;
    }
    public void setAngle3d(Angle3D angle3d) {
        this.angle3d = angle3d;
    }
    
    public void rotate (Angle3D a3d) {
        this.angle3d = a3d;
    }

    public void move (Point3D p3d) {
        this.location.setPoint3d(p3d);
    }
}
