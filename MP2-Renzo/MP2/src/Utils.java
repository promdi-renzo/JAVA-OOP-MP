import java.util.Scanner;

public class Utils {

    Scanner scanner = new Scanner(System.in);

    public Utils() {
    }

    public String getStringAnswer(String question){
        System.out.println(question);
        return scanner.nextLine();
    }

    public int getIntAnswer(String question){
        System.out.println(question);
        return scanner.nextInt();
    }
}
