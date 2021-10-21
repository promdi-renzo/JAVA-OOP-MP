import java.util.Scanner;

public class EstuyanteMain{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
        int num;

        BSITclass bsit = new BSITclass("Maria","2nd","23","BSIT","VB");
        BSITclass bsit1 = new BSITclass(90,80,75,85,76,90);

        BECEclass bece = new BECEclass("Maria","2nd","23","BECE","JAVA");
        BECEclass bece1 = new BECEclass(98,80,80,80,80,80);

        System.out.println("Type num: ");
        num = s.nextInt();
        if(num == 1){
            System.out.println(bsit.toPrintString());
            System.out.println(bsit1.toPrintStudentAssessment());
        }else if(num == 0){
            System.out.println(bece.toPrintString());
            System.out.println(bece1.toPrintStudentAssessment());
        }else{
            System.out.println("Walang gagawin");
        }

    }
}
