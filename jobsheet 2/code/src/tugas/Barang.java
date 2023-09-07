package tugas;

public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Berikut Data Barang\n");
        System.out.println("Kode\t\t:" + kode + "\nNama Barang\t:" + namaBarang + "\nHarga Dasar\t:Rp " + hargaDasar + "\nDiskon\t\t:" + diskon + "%\nHarga Jual\t:Rp " + hitungHargaJual());
    }
}
