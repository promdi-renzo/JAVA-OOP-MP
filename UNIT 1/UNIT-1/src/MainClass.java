import java.util.Scanner;

public class MainClass {

    private Scanner s;
    private int numChoose;
    private SalariedEmployee salaried;
    private HourlyEmployee hourly;

    public MainClass() {
        salaried = new SalariedEmployee(1, "Renzo", "Cabarios", 20, "123342234567", "1234", "1234", "1234", 5000);
        hourly = new HourlyEmployee(1, "Renzo", "Cabarios", 20, "123342234567", "1234", "1234", "1234", 50, 20);

        s = new Scanner(System.in);

        System.out.println("Choose a number");
        numChoose = s.nextInt();
        s.nextLine();

        if(numChoose == 1){
            //salaried

            System.out.println(salaried.toString());
            System.out.println(salaried.weeklySalaryToString());
            System.out.println(salaried.monthlySalaryToString());
            System.out.println(salaried.toStringDeduction(salaried.getMonthlySalary(salaried.getWeeklySalary())));

        }else {
            System.out.println(hourly.toString());
            System.out.println(hourly.weeklySalaryToString());
            System.out.println(hourly.monthlySalaryToString());
            System.out.println(hourly.toStringDeduction(hourly.getMonthlySalary()));
        }

    }

    public static void main (String[] args){
        new MainClass();
    }
}
