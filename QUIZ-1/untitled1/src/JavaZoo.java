public class JavaZoo {

    public static void main(String[] args) {

        ZooAnimal animal1 = new ZooAnimal("Brown", "Dolhpin", 10, true);
        Cage cage1 = new Cage(10, 10, 10, true, true);
        ZooKeeper zooKeeper1 = new ZooKeeper("Dustin", "Mr.", 15, false);

        // Animal
        System.out.println("The zoo animal name " + animal1.getName() + " is " + Integer.toString(animal1.getAge()) + " years old. " + animal1.hungrys("The zoo animal is hungry"));

        // Cage
        System.out.println("The cage length is " + Integer.toString(cage1.getLength()) + ", width is " + Integer.toString(cage1.getWidth()) + " and height is " + Integer.toString(cage1.getHeight()));
        System.out.println(cage1.cleans() +" "+ cage1.covered());

        // ZooKeeper
        System.out.println("The zookeeper named " + zooKeeper1.getTitle() + zooKeeper1.getName() + " " + zooKeeper1.degree() + " and paid for $" + zooKeeper1.getPayRate() + " per hour");
    }
}
