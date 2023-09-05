package ru.geekbrains.lesson1.store3D.ModelElements;

public class Flash {

    private Location location;
    private Angle3D angle3d;
    private Color color;
    private Float power;
    public Flash(Location location, Angle3D angle3d, Color color, Float power) {
        this.location = location;
        this.angle3d = angle3d;
        this.color = color;
        this.power = power;
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
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Float getPower() {
        return power;
    }
    public void setPower(Float power) {
        this.power = power;
    }

    public void rotate (Angle3D a3d) {
        this.angle3d = a3d;
    }

    public void move (Point3D p3d) {
        this.location.setPoint3d(p3d);
    }
    
}
