public class VolumeOfCone {

    private double radius, height;

    public double calculateVolume(){
        return (Math.PI)*(radius * radius)*(height/3);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}