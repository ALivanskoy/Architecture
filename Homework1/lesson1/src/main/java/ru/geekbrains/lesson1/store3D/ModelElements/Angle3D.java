package ru.geekbrains.lesson1.store3D.ModelElements;

public class Angle3D {

    private Angle angleX, angleY, angleZ;

    public Angle3D(Angle angleX, Angle angleY, Angle angleZ) {
        this.angleX = angleX;
        this.angleY = angleY;
        this.angleZ = angleZ;
    }

    public Angle getAngleX() {
        return angleX;
    }

    public void setAngleX(Angle angleX) {
        this.angleX = angleX;
    }

    public Angle getAngleY() {
        return angleY;
    }

    public void setAngleY(Angle angleY) {
        this.angleY = angleY;
    }

    public Angle getAngleZ() {
        return angleZ;
    }

    public void setAngleZ(Angle angleZ) {
        this.angleZ = angleZ;
    }
   

}
