public class Student {
    private String studName;
    private String studYear;
    private String studCourse;
    private String studSubj;
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int unit1;
    private int unit2;
    private int term;

    public Student() {
    }

    public Student(String studName, String studYear, String studCourse, String studSubj) {
        this.studName = studName;
        this.studYear = studYear;
        this.studCourse = studCourse;
        this.studSubj = studSubj;
    }

    public Student(int quiz1, int quiz2, int quiz3, int unit1, int unit2, int term) {
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.unit1 = unit1;
        this.unit2 = unit2;
        this.term = term;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudYear() {
        return studYear;
    }

    public void setStudYear(String studYear) {
        this.studYear = studYear;
    }

    public String getStudCourse() {
        return studCourse;
    }

    public void setStudCourse(String studCourse) {
        this.studCourse = studCourse;
    }

    public String getStudSubj() {
        return studSubj;
    }

    public void setStudSubj(String studSubj) {
        this.studSubj = studSubj;
    }

    public int getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(int quiz1) {
        this.quiz1 = quiz1;
    }

    public int getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(int quiz2) {
        this.quiz2 = quiz2;
    }

    public int getQuiz3() {
        return quiz3;
    }

    public void setQuiz3(int quiz3) {
        this.quiz3 = quiz3;
    }

    public int getUnit1() {
        return unit1;
    }

    public void setUnit1(int unit1) {
        this.unit1 = unit1;
    }

    public int getUnit2() {
        return unit2;
    }

    public void setUnit2(int unit2) {
        this.unit2 = unit2;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }


    public double getWeightQuiz() {
        double weightedQ;
        weightedQ = (quiz1 + quiz2 + quiz3)/100 *0.30 * 100;
        return weightedQ;
    }
    public double getWeightUnit() {
        double weightedU;
        weightedU = (unit1 + unit2)/100 *0.40 * 100;
        return weightedU;
    }
    public double getWeightTerm() {
        double weightedTerm;
        weightedTerm = (term)/100 *0.40 * 100;
        return weightedTerm;
    }
    public double getRawGrade() {
        double grd;
        grd = getWeightQuiz() + getWeightUnit() + getWeightTerm();
        return grd;
    }
    public double getGrade() {
        double fgrd;
        if (getRawGrade()>=98 && getRawGrade()<=100) {
            fgrd = 1.00;
        }else if (getRawGrade()>=91 && getRawGrade()<=97) {
            fgrd = 1.25;
        }else if (getRawGrade()>=85 && getRawGrade()<=90) {
            fgrd = 1.50;
        }else if (getRawGrade()>=79 && getRawGrade()<=84) {
            fgrd = 1.75;
        }else if (getRawGrade()>=73 && getRawGrade()<=78) {
            fgrd = 2.00;
        }else if (getRawGrade()>=67 && getRawGrade()<=72) {
            fgrd = 2.25;
        }else if (getRawGrade()>= 61 && getRawGrade()<=66) {
            fgrd = 2.50;
        }else if (getRawGrade()>=55 && getRawGrade()<=60) {
            fgrd = 2.75;
        }else {
            fgrd = 3.00;
        }
        return fgrd;
    }

    public String Remark() {
        String remark;
        if (getGrade() > 3.00) {
            remark = "Failed";
        } else {
            remark = "Passed";
        }
        return remark;

    }
}
