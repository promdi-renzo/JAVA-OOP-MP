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
}
