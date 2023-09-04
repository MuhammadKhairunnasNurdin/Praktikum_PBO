public class PocoF5 extends Smartphone {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void printInformation() {
        super.printInfo("type Smartphone: ", type);
    }
}
