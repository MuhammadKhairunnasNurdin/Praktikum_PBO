public class Demo {
    public static void main(String[] args) {
//        create Object from our 4 class
        Cup cupOne = new Cup();
        Lighter lighterOne = new Lighter();
        Iphone13 iphone13One = new Iphone13();
        PocoF5 pocoF5One = new PocoF5();

        System.out.println("call method from Cup Class");
        cupOne.setMaterial("glass");
        cupOne.setContent("milk");
        cupOne.printInfo();

        System.out.println("\ncall method from Lighter class");
        lighterOne.countSize(0.03f, 0.01f);
        lighterOne.setCondition("not broken");
        lighterOne.printInfo();

        System.out.println("\ncall method from Iphone13 class");
        iphone13One.setOs("IOS");
        iphone13One.setBrand("Iphone");
        iphone13One.setPrice(15000000);
        iphone13One.printInformation();

        System.out.println("\ncall method from PocoF5 class");
        pocoF5One.setOs("Android");
        pocoF5One.setBrand("Poco");
        pocoF5One.setType("F5 GT");
        pocoF5One.printInformation();
    }
}
