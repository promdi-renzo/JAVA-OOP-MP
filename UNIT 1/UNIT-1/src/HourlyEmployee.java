public class HourlyEmployee extends Employee{

    private int hoursWorked;
    private double wageRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int hoursWorked, double wageRate) {
        this.hoursWorked = hoursWorked;
        this.wageRate = wageRate;
    }

    public HourlyEmployee(int id, String fName, String lName, int age, String phoneNum, String sssNum, String pagibigNum, String philHealthNum, int hoursWorked, double wageRate) {
        super(id, fName, lName, age, phoneNum, sssNum, pagibigNum, philHealthNum);
        this.hoursWorked = hoursWorked;
        this.wageRate = wageRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public String weeklySalaryToString() {
        return "{" +
                "weeklySalary=" + getWeeklySalary() +
                '}';
    }

    public String monthlySalaryToString() {
        return "{" +
                "monthlySalary=" + getMonthlySalary() +
                '}';
    }

    public double getWeeklySalary(){
        int NORMAL_HOURS = 40;
        double weekly;
        int extraHours;

        if(getHoursWorked() > NORMAL_HOURS){
            extraHours = getHoursWorked() - 40;
            weekly = (NORMAL_HOURS*getWageRate()) + (getWageRate()*1.5)*extraHours;
            return weekly;
        }

        weekly = getHoursWorked() * getWageRate();
        return weekly;
    }

    public double getMonthlySalary(){
        return getWeeklySalary() * 4;
    }
}
