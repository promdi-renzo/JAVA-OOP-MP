public class ZooKeeper {
    private String name;
    private String title;
    private double payRate;
    private boolean degree;

    public ZooKeeper() {
    }

    public ZooKeeper(String name, String title, double payRate, boolean degree) {
        this.name = name;
        this.title = title;
        this.payRate = payRate;
        this.degree = degree;
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

    public boolean isDegree() {
        return degree;
    }

    public String setDegree() {
        return null;
    }

    public String degree(){
        if(getPayRate() < 25){
            return "has no degree";
        }

        return "has degree";
    }
}
