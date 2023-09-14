import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Matkul matkul1 = new Matkul("OOP");
        List<Matkul> matkulList = new ArrayList<>();
        matkulList.add(matkul1);
        Matkul matkul2 = new Matkul("OOP");
        Matkul matkul3 = new Matkul("WEB");

        if (matkul1.equals(new Matkul("OOP"))) {
            System.out.println("wenak");
        }
        if (matkul1.equals(matkul2)) {
            System.out.println("kanew");
        } else {
            System.out.println("minus");
        }


        System.out.println("\nTest2======================");
        if (matkulList.contains(new Matkul("oop"))) {
            System.out.println("Wenak lagi");
        } else {
            System.out.println("Minuss");
        }

    }
}
