public class BSITclass extends EstudClass {

    private String studCourse;
    private String studSubj;


    public BSITclass() {

    }

    public BSITclass(String studName, String studYear,String studAge,String studCourse,String studSubj) {
        super(studName,studYear,studAge);
        this.studCourse = studCourse;
        this.studSubj = studSubj;
    }


    public BSITclass(int quiz1,int quiz2,int quiz3,int unit1,int unit2,int term) {
        super(quiz1,quiz2,quiz3,unit1,unit2,term);
    }


    public String getStudCourse() {
        return studCourse;
    }
    public String getStudSubj() {
        return studSubj;
    }

    public String toPrintString() {

        return String.format("%s\n  %s\n  %s\n  %s\n  %s\n" ,
                getName(),getYear(),getStudAge(),this.getStudCourse(),this.getStudSubj());
    }

    public String toPrintStudentAssessment() {

        return String.format("%s\n  %s\n  %s\n  %s\n  %s\n  %s\n",
                "Quiz Ave: " + String.valueOf(getwtAve(getQuiz1(),getQuiz2(),getQuiz3())),
                "Unit Ave: " + String.valueOf(getwtAve(getUnit1(),getUnit2())),
                "Term    : " + String.valueOf(getwtAve(getTerm())),
                "Raw grd : " + String.valueOf(getRawgrd()),
                "Finalgrd: " + String.valueOf(getFgrade()),
                "Remark  : " + getRemark());
    }
}
