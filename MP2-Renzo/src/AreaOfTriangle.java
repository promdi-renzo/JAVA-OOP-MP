public class AreaOfTriangle {
    private double width, height;

    public double calculateArea(){
        return getWidth() * getHeight() * 0.5;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}