package tugas;

public class SewaGame {
    //semua attribute dibuat private agar data aman dengan konsep enskapsulasi, dan
    // dibuat final agar hanya terjadi 1 kali inisialisasi data pada attribute(satu kali isi data)
    private final String id, namaMember, namaGame;
    private final int hargaBayar;

    public SewaGame(String id, String namaMember, String namaGame, int lamaSewa, int harga) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.hargaBayar = getRentalPrice(lamaSewa, harga);
    }

    public void printBorrower() {
        System.out.println("=============================================");
        System.out.println("Id\t\t\t: " + id + "\nNama Member\t: " + namaMember + "\nNama Game\t: " + namaGame +
                "\nHarga Rental: " + hargaBayar);
    }

    private int getRentalPrice(int lamaSewa, int harga) {
        return lamaSewa * harga;
    }
}
