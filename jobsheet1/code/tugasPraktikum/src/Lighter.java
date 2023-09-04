public class Lighter {
    private double size;
    private String condition;

    public void countSize(double length, double width) {
        this.size = length * width;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void printInfo() {
        System.out.println("Table Size: " + size + " Square Meter" +  "\nForm\t  : " + condition);
    }
}
