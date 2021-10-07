public class ZooAnimal {

    private String name;
    private String type;
    private Integer age;
    private boolean hungry;


    public ZooAnimal() {

    }

    public ZooAnimal(String name, String type, Integer age, boolean hungry) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public String hungrys(String gutom){


        if(getAge() > 0){
            return gutom;
        }

        return "The zoo animal is not hungry";
    }
}
