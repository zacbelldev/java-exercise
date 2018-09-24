public class MammalBean {
    //    Definitions
    private int legCount;
    private String color;
    private double height;

//    MammalBean() {
//    }

    // Constructor
    public MammalBean(int legCount, String color, double height) {
        this.legCount = legCount;
        this.color = color;
        this.height = height;
    }

    // LEG COUNT GETTER/SETTER
    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    // COLOR GETTER/SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // HEIGHT GETTER/SETTER
    public double getheight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
