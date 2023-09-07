package tugas;

public class DemoBarang {
    public static void main(String[] args) {
        Barang item = new Barang();
        item.kode = "0001";
        item.namaBarang = "Kopi Torabika";
        item.hargaDasar = 40000;
        item.diskon = 0.1F;

        item.tampilData();
    }
}
