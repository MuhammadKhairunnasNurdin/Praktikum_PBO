import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class Dosen {
    private final String nama;
    private final String nip;
    private final List<Matkul> matkulList;

    public Dosen(String nama, String nip, Matkul...obj) {
        this.nama = nama;
        this.nip = nip;
        this.matkulList = Arrays.asList(obj);
    }

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
        this.matkulList = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dosen dosen)) return false;
        return Objects.equals(nama, dosen.nama) && Objects.equals(nip, dosen.nip);
    }

    @Override
    public String toString() {
        return "Dosen{" +
                "nama='" + nama + '\'' +
                ", nip='" + nip + '\'' +
                '}';
    }

    public static Dosen loginDosen(SistemNilai sistemNilai, Scanner input) {
        System.out.print("Login Dosen\n===================================\nNama: ");
        String nama = input.nextLine();
        System.out.print("Nip: ");
        String nip = input.nextLine();
        Dosen dosen = sistemNilai.searchDosen(new Dosen(nama, nip));

        if (dosen == null) {
            System.out.println("Cannot to login, try input again");
            return loginDosen(sistemNilai, input);
        }

        System.out.println("Login success\n==============================");
        return dosen;
    }

    private boolean isMatkulNonValid(Matkul matkul) {
        return matkulList.stream().noneMatch(matkul1 -> matkul1.equals(matkul));
    }

    public void inputNilai(SistemNilai sistemNilai, Scanner input) {
        System.out.print("Input Nama Matkul: ");
        Matkul matkul = new Matkul(input.nextLine());

        if (isMatkulNonValid(matkul)) {
            System.out.println("Matkul is non valid, try to input from beginning");
            inputNilai(sistemNilai, input);
            return;
        }

        System.out.print("Input Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Input Nim Mahasiswa: ");
        String nim = input.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

        if (sistemNilai.isMahasiswaNonValid(mahasiswa)) {
            System.out.println("Mahasiswa Non valid, try to input from beginning");
            inputNilai(sistemNilai, input);
            return;
        }

        System.out.print("Input nilai: ");
        float nilai = input.nextFloat();

        sistemNilai.addNilai(new Nilai(this, matkul, mahasiswa, nilai));
    }
}
