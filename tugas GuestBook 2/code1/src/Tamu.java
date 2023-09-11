import java.util.Scanner;

public class Tamu {
    private String nama,alamat,nomor_hp, komentar;

    public Tamu() {
    }

    public Tamu(String nama, String alamat, String nomor_hp, String komentar) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_hp = nomor_hp;
        this.komentar = komentar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomor_hp() {
        return nomor_hp;
    }

    public void setNomor_hp(String nomor_hp) {
        this.nomor_hp = nomor_hp;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    @Override
    public String toString() {
        return "=============================================\nNama\t:" + nama
                + "\nAlamat\t:" + alamat
                + "\nNo Hp\t:" + nomor_hp + "\nKomentar:" + komentar
                + "\n=============================================";
    }

    /*dengan memindah method addBukuTamu dari Main class, dengan pengubahan pada field class Tamu,
     *kita tinggal mengubah class Tamu saja, tanpa mengubah class yang lain.Oleh karna itu pada todo 1 dan 2
     *kita selesaikan hanya dengan modifikasi pada class Tamu saja, dengan ini penerapan konsep enskapsulasi
     * yaitu pengelompokan method-method pada class terdekatnya terlaksana
     */

    public static void addBukuTamu(Scanner scanner, BukuPengunjung bukuPengunjung) {
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan nomor hp: ");
        String nomor_hp = scanner.nextLine();
        System.out.print("Masukkan komentar: ");
        String komentar = scanner.nextLine();
        Tamu tamuBaru = new Tamu(nama,alamat,nomor_hp, komentar);
        bukuPengunjung.addTamu(tamuBaru);
    }
}
