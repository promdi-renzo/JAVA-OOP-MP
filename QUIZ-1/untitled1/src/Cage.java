public class Cage {

    private Integer length;
    private Integer width;
    private Integer height;
    private boolean clean;
    private boolean covered;

    public Cage() {
    }

    public Cage(Integer length, Integer width, Integer height, boolean clean, boolean covered) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.clean = clean;
        this.covered = covered;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public boolean isClean() {
        return clean;
    }

    public boolean isCovered() {
        return covered;
    }

    public String cleans(){

        if(length == width && width == height){
            return "The cage is clean.";
        }

        return "The cage is not clean.";
    }

    public String covered(){
        if(isCovered()){
            return "The cage is covered.";
        }
        return "The cage is not covered.";
    }
}
