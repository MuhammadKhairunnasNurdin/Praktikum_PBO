package tugas;

import java.util.Scanner;

public class DemoLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran circle = new Lingkaran();
        circle.phi = 3.14;
        String boundary = "===========================================";
        System.out.println("Menghitung Luas dan Keliling Lingkaran\n" + boundary);
        circle.r = 10;
        System.out.println("Luas lingkaran dengan jari-jari = 10 adalah: " + circle.hitungLuas());
        circle.r = 20;
        System.out.println("Keliling lingkaran dengan jari-jari = 20 adalah: " + circle.hitungKeliling());
    }
}
