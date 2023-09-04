public class Iphone13 extends Smartphone {
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void printInformation() {
        super.printInfo("price", price);
    }
}
