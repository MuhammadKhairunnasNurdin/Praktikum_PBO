import java.util.Objects;
import java.util.Scanner;

public class Mahasiswa {
    private final String nama, nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void printEvaluation(SistemNilai sistemNilai) {
        sistemNilai.printEvaluation(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mahasiswa mahasiswa)) return false;
        return Objects.equals(nama, mahasiswa.nama) && Objects.equals(nim, mahasiswa.nim);
    }

    public static Mahasiswa loginMahasiswa(Scanner input) {
        System.out.print("Login Mahasiswa\n===================================\nNama: ");
        String nama = input.nextLine();
        System.out.print("Nim: ");
        String nim = input.nextLine();
        return new Mahasiswa(nama, nim);
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                '}';
    }
}
