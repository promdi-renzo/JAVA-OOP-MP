public class ZooKeeper {
    private String name;
    private String title;
    private double payRate;
    private boolean degree;
    private String gender;

    public ZooKeeper() {
    }

    public ZooKeeper(String name, String title, double payRate, boolean degree) {
        this.name = name;
        this.title = title;
        this.payRate = payRate;
        this.degree = degree;
    }

    public ZooKeeper(String name, double payRate, boolean degree, String gender) {
        this.name = name;
        this.payRate = payRate;
        this.degree = degree;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public double getPayRate() {
        return payRate;
    }

    public boolean hasDegree() {
        return degree;
    }

    public void feedAnimal(){
        System.out.print("The Zookeeper is feeding the animal. ");
    }

    public void feedAnimal(String name, String animal){
        System.out.print("The zookeeper named "+getTitle()+ name+ " is feeding the animal named" + animal + ". ");
    }

    public void cleanCage(){
        System.out.print("The Zookeeper is cleaning the cage. ");
    }

//    public String setDegree() {
//        return null;
//    }
//
//    public String degree(){
//        if(getPayRate() < 25){
//            return "has no degree";
//        }
//
//        return "has degree";
//    }
}
