public class AreaOfRectangle{

    private double width, height;

    public double calculateArea(){
        return getWidth() * getHeight();
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