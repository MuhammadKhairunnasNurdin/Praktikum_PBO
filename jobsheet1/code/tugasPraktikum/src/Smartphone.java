public class Smartphone {
    private String brand, os;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void printInfo(String typeInfo, Object valueInfo) {
        System.out.println("Brand Smartphone\t: " + brand + "\nOperating System\t: " + os + "\n" + typeInfo + "\t: " + valueInfo);
    }
}
