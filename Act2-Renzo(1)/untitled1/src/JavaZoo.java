public class JavaZoo {

    public static void main(String[] args) {

        ZooAnimal animal1 = new ZooAnimal("Chips", "Dolhpin", 10, true);
        Cage cage1 = new Cage(10, 10, 10, true, true);
        ZooKeeper zooKeeper1 = new ZooKeeper("Hudson", "Mr.", 15, false);

        zooKeeper1.feedAnimal();
        animal1.eat();
        if(!animal1.isHungry()){
            System.out.print("The zoo animal is no longer hungry. ");
        }
        System.out.println(" ");

        zooKeeper1.cleanCage();
        animal1.sleep();
        if(animal1.isHungry()){
            System.out.print("The zoo animal is hungry. ");
        }
        System.out.println(" ");

        zooKeeper1.feedAnimal(zooKeeper1.getName(), animal1.getName());
        animal1.eat();
        if(!animal1.isHungry()){
            System.out.print("Chips is no longer hungry. ");
        }

        System.out.println(" ");
    }
}
