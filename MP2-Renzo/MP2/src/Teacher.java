public class Teacher {
    private String tName;
    private String tDept;

    public Teacher() {
    }

    public Teacher(String tName, String tDept) {
        this.tName = tName;
        this.tDept = tDept;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettDept() {
        return tDept;
    }

    public void settDept(String tDept) {
        this.tDept = tDept;
    }
}
