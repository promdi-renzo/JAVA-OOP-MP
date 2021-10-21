public class ZooAnimal {

    private String name;
    private String type;
    private Integer age;
    private boolean hungry;
    private String height;



    public ZooAnimal() {

    }

    public ZooAnimal(String name, String type, Integer age, boolean hungry) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungry = hungry;
    }

    public ZooAnimal(String name, Integer age, boolean hungry, String height) {
        this.name = name;
        this.age = age;
        this.hungry = hungry;
        this.height = height;
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
    public void sleep(){
        System.out.print("The Zoo Animal is Sleeping. ");
        hungry = true;
    }
    public void eat(){
        System.out.print("The Zoo Animal is Eating. ");
        hungry = false;
    }
}
