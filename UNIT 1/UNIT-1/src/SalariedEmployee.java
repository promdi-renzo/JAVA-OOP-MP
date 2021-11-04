public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(int id, String fName, String lName, int age, String phoneNum, String sssNum, String pagibigNum, String philHealthNum, double weeklySalary) {
        super(id, fName, lName, age, phoneNum, sssNum, pagibigNum, philHealthNum);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }



    public String weeklySalaryToString() {
        return "{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }

    public String monthlySalaryToString() {
        return "{" +
                "monthlySalary=" + getMonthlySalary(getWeeklySalary()) +
                '}';
    }
    public double getMonthlySalary(double weeklySalary){
        return getWeeklySalary() * 4;
    }
}
