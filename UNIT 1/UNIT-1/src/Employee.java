public class Employee {
    private static final double SSS_RATE = 0.02;
    private static final double PAGIBIG_RATE = 0.01;
    private static final double PHILHEALTH_RATE = 0.01;

    private int id;
    private String fName;
    private String lName;
    private int age;
    private String phoneNum;
    private String sssNum;
    private String pagibigNum;
    private String philHealthNum;


    public Employee() {
    }

    public Employee(int id, String fName, String lName, int age, String phoneNum, String sssNum, String pagibigNum, String philHealthNum) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.phoneNum = phoneNum;
        this.sssNum = sssNum;
        this.pagibigNum = pagibigNum;
        this.philHealthNum = philHealthNum;
    }

    public static double getSssRate() {
        return SSS_RATE;
    }

    public static double getPagibigRate() {
        return PAGIBIG_RATE;
    }

    public static double getPhilhealthRate() {
        return PHILHEALTH_RATE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSssNum() {
        return sssNum;
    }

    public void setSssNum(String sssNum) {
        this.sssNum = sssNum;
    }

    public String getPagibigNum() {
        return pagibigNum;
    }

    public void setPagibigNum(String pagibigNum) {
        this.pagibigNum = pagibigNum;
    }

    public String getPhilHealthNum() {
        return philHealthNum;
    }

    public void setPhilHealthNum(String philHealthNum) {
        this.philHealthNum = philHealthNum;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", sssNum='" + sssNum + '\'' +
                ", pagibigNum='" + pagibigNum + '\'' +
                ", philHealthNum='" + philHealthNum + '\'' +
                '}';
    }

    public String toStringDeduction(double salary) {
        return  "{" +
                "pension=" + getPensionCont(salary) +
                ", SSS='" + getSSSCont(salary) + '\'' +
                ", Pagibig='" + getPagibigCont(salary) + '\'' +
                ", PhilHealth=" + getPhilHealthCont(salary) +
                ", Tax='" + getTaxCont(salary) + '\'' +
                ", Total Deduction='" + getTotalDeductions(salary) + '\'' +
                ", Net Salary='" + (salary - getTotalDeductions(salary)) + '\'' +
                '}';
    }
    private double getTotalDeductions(double salary){
        double total = getPensionCont(salary) + getSSSCont(salary) + getPagibigCont(salary) + getPhilHealthCont(salary) + getTaxCont(salary);
        return total;
    }

    private double getPensionCont(double salary) {
        double pensionCont = 0;
        if(age <= 17){
            pensionCont = 0;
        }else if(age > 17 && age <= 55){
            pensionCont = salary * 0.15;
        }else if(age > 55 && age <= 60){
            pensionCont = salary * 0.10;
        }else if(age > 60 && age <= 65){
            pensionCont = salary * 0.075;
        }else if(age > 65){
            pensionCont = salary * 0.05;
        }
        return pensionCont;
    }

    private double getSSSCont(double salary) {
        return salary * getSssRate();
    }
    private double getPagibigCont(double salary) {
        return salary * getPagibigRate();
    }
    private double getPhilHealthCont(double salary) {
        return salary * getPhilhealthRate();
    }

    private double getTaxCont(double salary) {
        double taxCont = 0;
        if(salary < 10000){
            taxCont = salary * 0.1;
        }else if(salary > 10000 && salary <= 30000){
            taxCont = 500 + ((salary - 10000) * 0.10);
        }else if(salary > 30000 && salary <= 70000){
            taxCont = 2500 + ((salary - 30000) * 0.15);
        }else if(salary > 70000 && salary <= 140000){
            taxCont = 8500 + ((salary - 70000) * 0.20);
        }else if(salary > 140000 && salary <= 250000){
            taxCont = 22500 + ((salary - 140000) * 0.25);
        }else if(salary > 250000 && salary <= 500000){
            taxCont = 50000 + ((salary - 250000) * 0.30);
        }else if(salary > 500000){
            taxCont = 125000 + ((salary - 500000) * 0.32);
        }
        return taxCont;
    }
}
