import java.util.Scanner;

public class MainClass {

    private Scanner scan = new Scanner(System.in);
    private AreaOfRectangle aor = new AreaOfRectangle();
    private AreaOfTriangle aot = new AreaOfTriangle();
    private AreaOfCircle aoc = new AreaOfCircle();
    private VolumeOfCone voc = new VolumeOfCone();

    public MainClass() {
        System.out.println("Welcome to Java");

        System.out.println("Calculate Rectangle!");
        System.out.println("Width: ");
        aor.setWidth(scan.nextDouble());
        System.out.println("Height: ");
        aor.setHeight(scan.nextDouble());
        System.out.println("Area of Rectangle: " + Double.toString(aor.calculateArea()));

        System.out.println("Calculate Triangle!");
        System.out.println("Width: ");
        aot.setWidth(scan.nextDouble());
        System.out.println("Height: ");
        aot.setHeight(scan.nextDouble());
        System.out.println("Area of Rectangle: " + Double.toString(aot.calculateArea()));

        System.out.println("Calculate Circle!");
        System.out.println("Radius: ");
        aoc.setRadius(scan.nextDouble());
        System.out.println("Area of Circle: " + Double.toString(aoc.calculateArea()));

        System.out.println("Calculate Cone!");
        System.out.println("Radius: ");
        voc.setRadius(scan.nextDouble());
        System.out.println("Height: ");
        voc.setHeight(scan.nextDouble());
        System.out.println("Volume of Cone: " + Double.toString(voc.calculateVolume()));
    }

    public static void main(String[] args) {
        new MainClass();
    }

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
    public class AreaOfCircle {

        private double radius;

        public double calculateArea(){
            return radius * radius * Math.PI;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }
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
}
