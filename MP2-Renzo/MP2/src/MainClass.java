public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        Utils util = new Utils();

        String sName,sYear,sCourse,sSubject;
        Integer q1,q2,q3,u1,u2,t1;
        String tName, tDept;


        tName = util.getStringAnswer("Enter Teacher's name: ");
        tDept = util.getStringAnswer("Enter Teacher's department: ");

        System.out.println(" ");

        Teacher t = new Teacher(tName, tDept);

        sName = util.getStringAnswer("Enter student name: ");
        sYear = util.getStringAnswer("Enter student year: ");
        sCourse = util.getStringAnswer("Enter student course: ");
        sSubject = util.getStringAnswer("Enter student subject: ");
        System.out.println(" ");

        q1 = util.getIntAnswer("Enter Quiz 1: ");
        q2 = util.getIntAnswer("Enter Quiz 2: ");
        q3 = util.getIntAnswer("Enter Quiz 3: ");
        u1 = util.getIntAnswer("Enter Unit 1: ");
        u2 = util.getIntAnswer("Enter Unit 2: ");
        t1 = util.getIntAnswer("Enter Term: ");

        Student s = new Student(sName, sYear, sCourse, sSubject);
        System.out.println(" ");

        System.out.println(t.gettName());
        System.out.println(t.gettDept());
        System.out.println(s.getStudName());
        System.out.println(s.getStudYear());
        System.out.println(s.getStudCourse());
        System.out.println(s.getStudCourse());

        Student ave = new Student(q1, q2, q3, u1, u2, t1);

        System.out.println(ave.getWeightQuiz());
        System.out.println(ave.getWeightUnit());
        System.out.println(ave.getWeightTerm());
        System.out.println(ave.getRawGrade());
        System.out.println(ave.getGrade());
        System.out.println(ave.Remark());

    }
}
