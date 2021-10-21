public class EstudClass {
    //member variables
    private String studName;
    private String studYear;
    private String studAge;


    private int quiz1;
    private int quiz2;
    private int quiz3;

    private int unit1;
    private int unit2;


    private int term;

    public EstudClass() {

    }

    public EstudClass(String studName, String studYear,String studAge) {
        this.studName = studName;
        this .studYear = studYear;
        this.studAge = studAge;

    }

    public EstudClass(int quiz1,int quiz2,int quiz3,int unit1,int unit2,int term)
    { this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.unit1 = unit1;
        this.unit2 = unit2;
        this.term = term;

    }

    public String getName() {
        return studName;
    }

    public String getYear() {
        return studYear;
    }



    public String getStudAge() {
        return studAge;
    }

    public int getQuiz1() {
        return quiz1;
    }

    public int getQuiz2() {
        return quiz2;
    }

    public int getQuiz3() {
        return quiz3;
    }

    public int getUnit1() {
        return unit1;
    }

    public int getUnit2() {
        return unit2;
    }

    public int getTerm() {
        return term;
    }

    public double getwtAve(int quiz1,int quiz2,int quiz3) {
        double weightedQ;
        weightedQ = (double)(quiz1 + quiz2 + quiz3)/300 *0.30 * 100;
        return weightedQ;
    }

    public double getwtAve(int unit1,int unit2) {
        double weightedU;
        weightedU = (double)(unit1 + unit2)/200 *0.40 * 100;
        return weightedU;
    }

    public double getwtAve(int term) {
        double weightedTerm;
        weightedTerm = (double)(term)/100.00 *0.40 * 100.00;
        return weightedTerm;
    }

    public double getRawgrd() {
        double grd;

        grd = getwtAve(quiz1,quiz2,quiz3) + getwtAve(unit1,unit2) + getwtAve(term);

        return grd;

    }

    public double getFgrade() {
        double fgrd;
        if (getRawgrd()>=98 && getRawgrd()<=100) {

            fgrd = 1.00;
        }else if (getRawgrd()>=91 && getRawgrd()<=97) {

            fgrd = 1.25;
        }else if (getRawgrd()>=85 && getRawgrd()<=90) {

            fgrd = 1.50;
        }else if (getRawgrd()>=79 && getRawgrd()<=84) {

            fgrd = 1.75;
        }else if (getRawgrd()>=73 && getRawgrd()<=78) {

            fgrd = 2.00;
        }else if (getRawgrd()>=67 && getRawgrd()<=72) {

            fgrd = 2.25;
        }else if (getRawgrd()>= 61 && getRawgrd()<=66) {

            fgrd = 2.50;
        }else if (getRawgrd()>=55 && getRawgrd()<=60) {

            fgrd = 2.75;
        }else {
            fgrd = 3.00;
        }
        return fgrd;
    }//end of getFgrade

    public String getRemark() {
        String rem;

        if (getFgrade() > 3.00){
            rem = "Failed";
        }else {
            rem = "Passed";
        }

        return rem;

    }
}
